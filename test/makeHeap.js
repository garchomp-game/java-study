//基本情報技術者試験　平成30年春期問8 makeHeap
var data = [5, 13, 36, 8, 2, 2, 34, 63, 32, 1, 23, 9, 16, 24, 54];
var heap = new Array(15);
var hnum = data.length;
makeHeap(data, heap, hnum);
showHeap();
function makeHeap(data, heap, hnum) {
    var i, k;
    for (i = 0; i < hnum; i++) {
        heap[i] = data[i]; // 二分木に追加
        k = i;
        while (k > 0) // 二分木の根の要素が最小になるまで繰り返す
            if (heap[k] > heap[myParent(k)]) {
                swap(heap, k, myParent(k));
                k = myParent(k);
            }
            else
                break; // 二分木に追加するフェーズに戻る
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
function myParent(i) {
    return Math.floor((i - 1) / 2);
}
function showHeap() {
    console.log("\u6574\u5217\u5F8C\u306E\u914D\u5217 => [".concat(heap, "]"));
    //木構造として整形して出力
    var tree = heap[0] + "\n";
    var j = 1;
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
