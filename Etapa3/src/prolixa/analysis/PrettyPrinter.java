package prolixa.analysis;

import prolixa.node.*;

public class PrettyPrinter extends DepthFirstAdapter {
    private int indent = 0;

    private void printIndent() {
        for (int i = 0; i < indent; i++) {
            System.out.print("  ");
        }
    }

    @Override
    public void defaultIn(Node node) {
        printIndent();
        System.out.println(node.getClass().getSimpleName());
        indent++;
    }

    @Override
    public void defaultOut(Node node) {
        indent--;
    }
}

