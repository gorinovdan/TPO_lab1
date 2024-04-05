package com.lasat.task2;

import org.junit.Test;
import static org.junit.Assert.*;

public class SplayTreeTest {

    @Test
    public void testInsert() {
        SplayTree tree = new SplayTree();
        tree.insert(10);
        assertEquals(10, tree.root.key);
        tree.insert(5);
        assertEquals(5, tree.root.key);
        tree.insert(15);
        assertEquals(15, tree.root.key);
        tree.insert(7);
        assertEquals(7, tree.root.key);
        tree.insert(13);
        assertEquals(13, tree.root.key);
        tree.insert(20);
        assertEquals(20, tree.root.key);
    }

    @Test
    public void testSearch() {
        SplayTree tree = new SplayTree();
        tree.insert(10);
        tree.insert(5);
        tree.insert(15);
        tree.insert(7);
        tree.insert(13);
        tree.insert(20);

        Node found = tree.search(7);
        assertNotNull(found);
        assertEquals(7, found.key);
        assertEquals(7, tree.root.key);

        found = tree.search(13);
        assertNotNull(found);
        assertEquals(13, found.key);
        assertEquals(13, tree.root.key);

        found = tree.search(100);
        assertNull(found);
    }

    @Test
    public void testDelete() {
        SplayTree tree = new SplayTree();
        tree.insert(10);
        tree.insert(5);
        tree.insert(15);
        tree.insert(7);
        tree.insert(13);
        tree.insert(20);

        tree.delete(7);
        assertEquals(5, tree.root.key);
        assertNull(tree.root.left);
        assertEquals(20, tree.root.right.key);
        assertEquals(13, tree.root.right.left.key);
        assertEquals(10, tree.root.right.left.left.key);
        assertEquals(15, tree.root.right.left.right.key);

        tree.delete(13);
        assertEquals(10, tree.root.key);
        assertEquals(5, tree.root.left.key);
        assertEquals(20, tree.root.right.key);
        assertEquals(15, tree.root.right.left.key);
        assertNull(tree.root.right.right);
    }
}
