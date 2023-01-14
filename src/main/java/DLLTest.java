public class DLLTest {
    public static void main(String[] args) {
        DLL dll = new DLL();
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(50);
        Node n4 = new Node(60);
        Node n5 = new Node(80);
        Node n6 = new Node(100);

        dll.push(n1);
        dll.push(n2);
        dll.push(n3);
        dll.push(n4);
        dll.push(n5);
        dll.push(n6);

        dll.printValuesForward();
        Node removedNode = dll.pop();
        System.out.println("Removed this value: " + removedNode.value);
        dll.printValuesBackward();
        boolean containsNode = dll.contains(10);
        System.out.println(containsNode);
        boolean containsNode1 = dll.contains(110);
        System.out.println(containsNode1);
        int nodeSize = dll.size();
        System.out.println("The number of nodes in the list is: " + nodeSize);


    }
}