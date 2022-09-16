//基本情報技術者試験　平成30年春期問8 heapSort
var data = [5, 13, 36, 8, 2, 2, 34, 63, 32, 1, 23, 9, 16, 24, 54];
var heap = [];
var hnum = data.length;

heapSort(data, heap, hnum);

console.log("heapSort実行後の配列");
console.log(`${heap}`);

function heapSort(data, heap, hnum) {
  var last;
  makeHeap(data, heap, hnum);
  for (last = hnum - 1; last > 0; last--) {
    swap(heap, 0, last);
    output(heap, last);
    downHeap(heap, last - 1);
  }
}

function downHeap(heap, hlast) {
  var n, tmp;
  n = 0;
  while (lchild(n) <= hlast) {
    tmp = lchild(n);
    if (rchild(n) <= hlast)
      if (heap[tmp] <= heap[rchild(n)])
        tmp = rchild(n);
    if (heap[tmp] > heap[n])
      swap(heap, n, tmp);
    else return;
    n = tmp;
  }
}

function makeHeap(data, heap, hnum) {
  var i, k;
  for (i = 0; i < hnum; i++) {
    heap[i] = data[i];
    k = i;
    while (k > 0)
      if (heap[k] > heap[parent(k)]) {
        swap(heap, k, parent(k));
        k = parent(k);
      } else break;
  }
}

function swap(heap, i, j) {
  var tmp;
  tmp = heap[i];
  heap[i] = heap[j];
  heap[j] = tmp;
}

function lchild(i) {
  return 2 * i + 1;
}

function rchild(i) {
  return 2 * i + 2;
}

function parent(i) {
  return Math.floor((i - 1) / 2);
}

function output(heap, last) {
  console.log(
      "last=" + last + ";downHeap開始前の配列 ");
  console.log(`${heap}`);
  console.log();
}