//基本情報技術者試験　平成30年春期問8 makeHeap
const data: number[]
  = [5, 13, 36, 8, 2, 2, 34, 63, 32, 1, 23, 9, 16, 24, 54];
let heap: number[] = new Array(15);
let hnum: number = data.length;

makeHeap(data, heap, hnum);
showHeap();

function makeHeap(data: number[], heap: number[], hnum: number): void {
  let i: number, k: number;
  for (i = 0; i < hnum; i++) {
    heap[i] = data[i]; // 二分木に追加
    k = i;
    while (k > 0) // 二分木の根の要素が最小になるまで繰り返す
      if (heap[k] > heap[myParent(k)]) {
        swap(heap, k, myParent(k));
        k = myParent(k);
      } else break; // 二分木に追加するフェーズに戻る
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

function showHeap(): void {
  console.log(`整列後の配列 => [${heap}]`);
  //木構造として整形して出力
  let tree: string = heap[0] + "\n";
  let j: number = 1;
  while (heap[Math.pow(2, j) - 1]) {
    tree +=
      heap
        .slice(Math.pow(2, j) - 1, Math.pow(2, j + 1) - 1)
        .toString() + "\n";
    j++;
  }
  console.log("木構造");
  console.log(tree);
}
