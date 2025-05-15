public class Tree
{
   private TreeNode myRoot;
   
   public Tree()
   {
      myRoot = null;
   }
   
   //pre: root points to an in-order Binary Search Tree
   //post:adds x to the tree such that the tree is still an in-order Binary Search Tree
   
   public void add(Comparable x)
   {
      myRoot = addHelper(myRoot, x);
   }
   
   private TreeNode addHelper(TreeNode root, Comparable x)
   {
      if(root == null){
         root = new TreeNode(x);
      }
      else {
         if(x.compareTo(root.getValue()) < 0){
            root.setLeft(addHelper(root.getLeft(), x));
         }
         if(x.compareTo(root.getValue()) > 0){
            root.setRight(addHelper(root.getRight(), x));
         }
      }

      return root;
   }
   
   //pre: root points to an in-order Binary Search Tree
   //post:removes x from the tree such that the tree is still an in-order Binary Search Tree
   
   public void remove(Comparable x)
   {
      myRoot = removeHelper(myRoot, x);
   }
   
   private TreeNode removeHelper(TreeNode root, Comparable x)
   {
      if(root == null){
         return root;
      }
      if(x.compareTo(root.getValue()) < 0){
            root.setLeft(removeHelper(root.getLeft(), x));
      }
      else if(x.compareTo(root.getValue()) > 0){
         root.setRight(removeHelper(root.getRight(), x));
      }
      else {
         if(root.getLeft() == null){
            return root.getRight();
         }
         if(root.getRight() == null){
            return root.getLeft();
         }

         TreeNode minimum = getMinNode(root);
         root.setValue(minimum.getValue());
         root.setRight(removeHelper(root.getRight(), minimum.getValue()));
      }

      return root;
   }

   static TreeNode getMinNode(TreeNode root) { // I actually had to write my own method for this
      root = root.getRight();

      while (root != null && root.getLeft() != null) {
         root = root.getLeft();
      }

      return root;
   } 
   
   //pre: root points to an in-order Binary Search Tree
   //post:shows the elements of the tree such that they are displayed in prefix order
   
   public void showPreOrder()
   {
      preOrderHelper(myRoot);
      System.out.println();
      
   }
   
   private void preOrderHelper(TreeNode root)
   {
      if(root != null){
         System.out.print(root.getValue() + " ");
         preOrderHelper(root.getLeft());
         preOrderHelper(root.getRight());
      }
   }
   
   //pre: root points to an in-order Binary Search Tree
   //post:shows the elements of the tree such that they are displayed in infix order
   
   public void showInOrder()
   {
      inOrderHelper(myRoot);
      System.out.println();
   }
   
   private void inOrderHelper(TreeNode root)   
   {
      if(root != null)
      {
         inOrderHelper(root.getLeft());
         System.out.print(root.getValue() + " ");    
         inOrderHelper(root.getRight());
      }
   }
      
   //pre: root points to an in-order Binary Search Tree
   //post:shows the elements of the tree such that they are displayed in postfix order
   
   public void showPostOrder()
   {
      postOrderHelper(myRoot);
      System.out.println();
      
   }
   
   private void postOrderHelper(TreeNode root)
   {
      if(root != null){
         postOrderHelper(root.getLeft());
         postOrderHelper(root.getRight());
         System.out.print(root.getValue() + " ");
      }
   }
   
   //pre: root points to an in-order Binary Search Tree
   //post:returns whether or not x is found in the tree
   
   public boolean contains(Comparable x)
   {
      if (searchHelper(myRoot, x) == null)
         return false;
      return true;
   }
   
   private TreeNode searchHelper(TreeNode root, Comparable x)
   {
      if(root != null){
         return null;
      }
      if(root.getValue().compareTo(x) == 0){
         return root;
      }
      else{
         if(root.getValue().compareTo(x) > 0){
            return searchHelper(root.getLeft(), x);
         }
         if(root.getValue().compareTo(x) < 0){
            return searchHelper(root.getRight(), x);
         }
      }
      return root;
   }
   
   //pre: root points to an in-order Binary Search Tree
   //post:returns a reference to the parent of the node that contains x, returns null if no such node exists
   //THIS WILL BE CALLED IN THE METHOD removeRecur

   //removeRecur isnt even part of this lab??? please revise your labs this pisses me off so much
   //this method isnt even called anywhere bruhh
   private TreeNode searchParent(TreeNode root, Comparable x)
   {
      if(root.getLeft().getValue().compareTo(x) == 0){
         return root;
      }
      if(root.getRight().getValue().compareTo(x) == 0){
         return root;
      }
      else{
         TreeNode left = null;
         TreeNode right = null;

         if(root.getLeft() != null){
            left = searchParent(root.getLeft(), x);
         }
         if(root.getRight() != null){
            right = searchParent(root.getRight(), x);
         }

         if(left != null){
            return left;
         }
         if(right != null){
            return right;
         }
      }
      return null;
   }
   
   //post: determines if root is a leaf or not O(1)
   private boolean isLeaf(TreeNode root)
   {
      if(root.getLeft() == null && root.getRight() == null){
         return true;
      }
      else {
         return false;
      }
   }
      
   //post: returns true if only one child O(1)
   private boolean oneKid(TreeNode root)
   {
      if(root != null){ // this is way too long I am stupid
         if(root.getLeft() != null || root.getRight() != null && !(root.getLeft() != null && root.getRight() != null) && !(root.getLeft() == null && root.getRight() == null)){
            return true;
         }
      }
      return false;
   }
      
   //pre: root points to an in-order Binary Search Tree
   //post:returns the number of nodes in the tree
   
   public int size()
   {
      return sizeHelper(myRoot);
   }
   
   private int sizeHelper(TreeNode root)
   {
      if(root == null){
         return 0;
      }
      else {
         int leftSide = sizeHelper(root.getLeft());
         int rightSide = sizeHelper(root.getRight());
         return leftSide + rightSide + 1;
      }
   }
         
   public int height()
   {
      return heightHelper(myRoot) - 1; // fix this
   }

   //pre: root points to an in-order Binary Search Tree
   //post:returns the height (depth) of the tree
   
   public int heightHelper(TreeNode root)
   {
      if(root != null){
         int leftSide = heightHelper(root.getLeft());
         int rightSide = heightHelper(root.getRight());

         return Math.max(leftSide, rightSide) + 1;
      }

      return 0;
   }
   
   //EXTRA CREDIT
   //pre: root points to an in-order Binary Search Tree
   //post:returns true if p is an ancestor of c, false otherwise
   
   public boolean isAncestor(TreeNode root, Comparable p, Comparable c)
   {
      return false;
   }
   
   //EXTRA CREDIT
   //pre: root points to an in-order Binary Search Tree
   //post:shows all elements of the tree at a particular depth
   
   public void printLevel(TreeNode root, int level)
   {
      
   }
 
   //Nothing to see here...move along.
   
   // orbele are we deadass???
   private String temp;
   private void inOrderHelper2(TreeNode root)   
   {
      if(root != null)
      {
         inOrderHelper2(root.getLeft());
         temp += (root.getValue() + ", "); 
         inOrderHelper2(root.getRight());
      }
   }

   public String toString()
   {
      temp = "";
      inOrderHelper2(myRoot);
      if(temp.length() > 1)
         temp = temp.substring(0, temp.length()-2);
      return "[" + temp + "]";
   }
  
}
