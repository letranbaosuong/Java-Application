package com.dhpm11.Tuan_2.Home.DOCUMENT.Sile;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class DemoJTree extends JFrame {
    public DemoJTree(String title) {
        super(title);
    }

    public static void main(String[] args) {
        DemoJTree ui = new DemoJTree("Demo JTree");
        ui.doShow();
    }

    private void doShow() {
        addControl();
        setSize(400, 300);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void addControl() {
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("ĐH Công Nghiệp");
        final JTree tree = new JTree(root);

        DefaultMutableTreeNode cnttNode = new DefaultMutableTreeNode("Công Nghệ TT");
        root.add(cnttNode);
        DefaultMutableTreeNode dhth1Node = new DefaultMutableTreeNode("Lớp ĐHTH1");
        cnttNode.add(dhth1Node);

        DefaultMutableTreeNode mttNode = new DefaultMutableTreeNode("May Thời Trang");
        root.add(mttNode);
        DefaultMutableTreeNode dhmtt1Node = new DefaultMutableTreeNode("Lớp ĐHMTT 1");
        DefaultMutableTreeNode dhmtt2Node = new DefaultMutableTreeNode("Lớp ĐHMTT 2");
        mttNode.add(dhmtt1Node);
        mttNode.add(dhmtt2Node);

        DefaultMutableTreeNode hhcNode = new DefaultMutableTreeNode("Hóa Hữu Cơ");
        root.add(hhcNode);

        getContentPane().add(tree);
    }
}
