class Node {
    int key;
    Node left, right, parent;

    Node(int item) {
        key = item;
        left = right = parent = null;
    }
}

class SplayTree {
    Node root;

    // Вспомогательные методы для вращения
    void zig(Node x) {
        Node p = x.parent;
        if (p.parent != null) {
            if (p.parent.left == p)
                p.parent.left = x;
            else
                p.parent.right = x;
        }
        if (x == p.left) {
            p.left = x.right;
            if (x.right != null)
                x.right.parent = p;
            x.right = p;
        } else {
            p.right = x.left;
            if (x.left != null)
                x.left.parent = p;
            x.left = p;
        }
        x.parent = p.parent;
        p.parent = x;
    }

    void splay(Node x) {
        while (x.parent != null) {
            Node p = x.parent;
            Node g = p.parent;
            if (g == null) {
                zig(x);
            } else {
                if ((g.left == p && p.left == x) || (g.right == p && p.right == x)) {
                    zig(p);
                    zig(x);
                } else {
                    zig(x);
                    zig(x);
                }
            }
        }
        root = x;
    }

    // Поиск узла с заданным ключом
    Node search(int key) {
        Node current = root;
        while (current != null) {
            if (key == current.key) {
                splay(current);
                return current;
            } else if (key < current.key) {
                if (current.left == null) {
                    splay(current);
                    return null;
                }
                current = current.left;
            } else {
                if (current.right == null) {
                    splay(current);
                    return null;
                }
                current = current.right;
            }
        }
        return null;
    }

    // Вставка узла с заданным ключом
    void insert(int key) {
        if (root == null) {
            root = new Node(key);
            return;
        }
        Node current = root;
        Node prev = null;
        while (current != null) {
            prev = current;
            if (key < current.key) {
                current = current.left;
            } else if (key > current.key) {
                current = current.right;
            } else {
                return; // Узел с таким ключом уже существует
            }
        }
        current = new Node(key);
        current.parent = prev;
        if (key < prev.key)
            prev.left = current;
        else
            prev.right = current;
        splay(current);
    }

    // Удаление узла с заданным ключом
    void delete(int key) {
        Node node = search(key);
        if (node == null) return;
        Node leftSubtree = node.left;
        Node rightSubtree = node.right;
        if (leftSubtree != null) {
            leftSubtree.parent = null;
            while (leftSubtree.right != null) {
                leftSubtree = leftSubtree.right;
            }
            splay(leftSubtree);
            leftSubtree.right = rightSubtree;
            if (rightSubtree != null)
                rightSubtree.parent = leftSubtree;
            root = leftSubtree;
        } else {
            root = rightSubtree;
            if (rightSubtree != null)
                rightSubtree.parent = null;
        }
    }

    private void printTree(Node node, String prefix, boolean isLeft) {
        if (node != null) {
            System.out.println(prefix + (isLeft ? "├── " : "└── ") + node.key);
            printTree(node.left, prefix + (isLeft ? "│   " : "    "), true);
            printTree(node.right, prefix + (isLeft ? "│   " : "    "), false);
        }
    }

    // Вывод дерева в форме дерева
    void printTree() {
        printTree(root, "", true);
    }

    public static void main(String[] args) {
        SplayTree tree = new SplayTree();
        tree.insert(10);
        tree.insert(5);
        tree.insert(15);
        tree.insert(3);
        tree.insert(7);
        tree.insert(12);
        tree.insert(17);
        tree.insert(1);

        System.out.println("Дерево после вставки: ");
        tree.printTree();
        System.out.println();

        tree.delete(1);
        System.out.println("Дерево после удаления: ");
        tree.printTree();
    }
}
