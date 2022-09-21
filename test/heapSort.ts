//基本情報技術者試験　平成30年春期問8 heapSort
let data: number[] = [5, 13, 36, 8, 2, 2, 34, 63, 32, 1, 23, 9, 16, 24, 54];
let heap: number[] = new Array(15);
let hnum: number = data.length;

heapSort(data, heap, hnum);

console.log("heapSort実行後の配列");
console.log(`${heap}`);

function heapSort(data: number[], heap: number[], hnum: number): void {
  let last: number;
  makeHeap(data, heap, hnum);
  for (last = hnum - 1; last > 0; last--) {
    swap(heap, 0, last);
    output(heap, last);
    downHeap(heap, last - 1);
  }
}

function downHeap(heap: number[], hlast: number): void {
  let n: number, tmp: number;
  n = 0;
  while (lchild(n) <= hlast) {
    let tmp: number = lchild(n);
    if (rchild(n) <= hlast)
      if (heap[tmp] <= heap[rchild(n)]) tmp = rchild(n);
    if (heap[tmp] > heap[n]) swap(heap, n, tmp);
    else
      return;
    n = tmp;
  }
}

function makeHeap(data: number[], heap: number[], hnum: number): void {
  let i: number, k: number;
  for (i = 0; i < hnum; i++) {
    heap[i] = data[i];
    k = i;
    while (k > 0)
      if (heap[k] > heap[myParent(k)]) {
        swap(heap, k, myParent(k));
        k = myParent(k);
      } else break;
  }
}

function swap(heap: number[], i: number, j: number): void {
  let tmp: number;
  tmp = heap[i];
  heap[i] = heap[j];
  heap[j] = tmp;
}

function lchild(i: number): number {
  return 2 * i + 1;
}

function rchild(i: number): number {
  return 2 * i + 2;
}

function myParent(i: number): number {
  return Math.floor((i - 1) / 2);
}

function output(heap: number[], last: number): void {
  console.log("last=" + last + ";downHeap開始前の配列 ");
  console.log(`${heap}`);
  console.log();
}
