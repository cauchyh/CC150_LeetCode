import java.util.*;


// this code is created to build a decision tree based on the
// given materials.
class Node
{
//	static final double THRESHOLD = 0.003;
	static final int LEAF = 1;
	static final int NONE_LEAF = 0;
	Node leftNode; // x
	Node midNode; // b
	Node rightNode; // o
	int test_condition; 
						// computed by find_best_split(), indicating which attribute this node use to split
						// which test_condition is this node being splited
	char class_value; // p if positive, n if negative, null if it is not a leaf node
	int node_att; // indicate whether this node is a leaf or non-leaf
	char dData; // this is created for future use
//	public Node()
//	{
//		node_att = 0;
//	}
	public void NodeDisplay()
	{
		System.out.println("Node test condition is: " + test_condition);
		if (leftNode != null)
			System.out.println("Left Node test condition: " + leftNode.test_condition);
		if (midNode != null)
			System.out.println("Middle Node test condition: " + midNode.test_condition);
		if (rightNode != null)
			System.out.println("Right Node test condition: " + rightNode.test_condition);
		System.out.println(leftNode.node_att);
		System.out.println(midNode.node_att);
		System.out.println(rightNode.node_att);
		System.out.println("left.left: " + leftNode.leftNode.node_att);
		System.out.println("left.right: " + leftNode.rightNode.node_att);
		System.out.println("mid: " + midNode.node_att);
		System.out.println("right.mid: " + rightNode.midNode.node_att);
		System.out.println("right.right: " + rightNode.rightNode.node_att);
		

//		System.out.println(leftNode.leftNode.class_value);
//		System.out.println(leftNode.rightNode.class_value);
	}
}


public class Decision_tree 
{
	static final int LEAF = 1;
	static final int NONE_LEAF = 0;
//	static final double THRESHOLD = 0.003;
	//double THRESHOLD;
	public Node root;
	Node fatherNode = new Node();
	Node currentNode = root;
	public Decision_tree () // Initialization
	{
		root = null;
	}

	public boolean TreeSearch(String test_set, Node root)
	{
		Node fatherNode = new Node();
		Node currentNode = root;
		char test_element;
//		int test_num = 0;
//		int same_value = 0;
//		System.out.println(this.test_condition);
		while (true)
		{
			// if current node is a leaf node
			// if it is, just compare the class of the test_set
//			if (currentNode.node_att == LEAF)
//			{
////				System.out.println(currentNode.node_att);
//				if (test_set.charAt(test_set.length()-1) == currentNode.class_value)
//				{
//					return true; // if the class fits, return true
//				}
//				else
//				{
//					return false; // the class does not fit, return false
//				}
//			}
//			else // if current node is NOT a leaf node
//			{	
				
				// generated errors are not taken into consideration in thie method
			
				// find out the element of the test_condition
				test_element = test_set.charAt(currentNode.test_condition); 
				// delete the tested parameter of the input string, which is the test set
//				test_set = test_set.substring(0,currentNode.test_condition) + test_set.substring(currentNode.test_condition+1);
//				System.out.println("test_condtion: " + currentNode.test_condition + " test_element: " + test_element
//						+ " test_set " + test_set);
				if (test_element == 'x' && currentNode.leftNode != null)
				{
					test_set = test_set.substring(0,currentNode.test_condition) + test_set.substring(currentNode.test_condition+1);
//					System.out.println("test_element == 'x'");
					fatherNode = currentNode;
					currentNode = currentNode.leftNode;
				}
				else if (test_element == 'o' && currentNode.rightNode != null)
				{
					test_set = test_set.substring(0,currentNode.test_condition) + test_set.substring(currentNode.test_condition+1);
//					System.out.println("test_element == 'o'");
					fatherNode = currentNode;
					currentNode = currentNode.rightNode;
				}
				else if (test_element == 'b' && currentNode.midNode != null)
				{
					test_set = test_set.substring(0,currentNode.test_condition) + test_set.substring(currentNode.test_condition+1);
//					System.out.println("test_element == 'b'");
					fatherNode = currentNode;
					currentNode = currentNode.midNode;
				}
				else 
				{
					if(test_set.charAt(test_set.length()-1) == currentNode.class_value)
					{
						//test_num++;
//						System.out.println("Reached!!!");
						return true;
					}
					else
					{
						return false;
					}
				}
//				return true; // generated errors are not taken into consideration in thie method
			}
		//}
//		for (int i=0; i<)
//		return true;
	}
	
	
	public Node TreeGrowth(ArrayList<String> sub_trainingset)//, ArrayList<String> attributes)
	{
		//Node current_node;
		if (stop_cond(sub_trainingset) == true)
		{
			Node leaf = new Node();
//			leaf.dData = "";
			leaf.node_att = LEAF;
			leaf.class_value = Classifier(sub_trainingset);
			// create the leaf node
			return leaf;
		}
		else
		{
			Node root = new Node();
			root.node_att = NONE_LEAF;
			root.class_value = Classifier(sub_trainingset);
			root.test_condition = find_best_split(sub_trainingset);
			// find_best_split returns the column number of the sub_attribute
//			root.test_condition = find_best_split(sub_trainingset, attributes);
			// find the possbile outcome of root, other words, x, o or b
			boolean x_exist = false;
			boolean o_exist = false;
			boolean b_exist = false;
			for (int i=0; i<sub_trainingset.size(); i++)
			{
				if (sub_trainingset.get(i).charAt(root.test_condition) == 'x')
				{
					x_exist = true;
//					System.out.println("x_exist");
					break;
				}
			}
			for (int i=0; i<sub_trainingset.size(); i++)
			{
				if (sub_trainingset.get(i).charAt(root.test_condition) == 'o')
				{
					o_exist = true;
//					System.out.println("o_exist");
					break;
				}
			}
			for (int i=0; i<sub_trainingset.size(); i++)
			{
				if (sub_trainingset.get(i).charAt(root.test_condition) == 'b')
				{
//					System.out.println("b_exist");
					b_exist = true;
					break;
				}
			}
		
				// recursively build the tree
				// set the node as a normal node
			if (x_exist)
			{
				ArrayList<String> sub_att_x = fetched_sub_trainingset('x', sub_trainingset);
//				System.out.println(sub_att_x);
				root.leftNode = TreeGrowth(sub_att_x);//,attributes);
//				root.leftNode.dData = 'x';
			}
			if (o_exist)
			{
				ArrayList<String> sub_att_o = fetched_sub_trainingset('o', sub_trainingset);
//				System.out.println(sub_att_o);
				root.rightNode = TreeGrowth(sub_att_o);//,attributes);
//				root.rightNode.dData = 'o';
			}
			if (b_exist)				
			{
				ArrayList<String> sub_att_b = fetched_sub_trainingset('b', sub_trainingset);
//				System.out.println(sub_att_b);
				root.midNode = TreeGrowth(sub_att_b);//,attributes);
//				root.midNode.dData = 'b';
			}
		return root;
		} //else
	}
	
	public ArrayList<String> fetched_sub_trainingset(char element, ArrayList<String> sub_trainingset)
	{
		int att_index = find_best_split(sub_trainingset);
		ArrayList<String> fetched_sub = new ArrayList<String>();
		for (int i=0; i<sub_trainingset.size(); i++)
		{
			String temp_store = "";
			// if this line has the element, such as x, 
			// then fetch this line and delete the element as to compose a new sub_training set
			if (sub_trainingset.get(i).charAt(att_index) == element)
			{
				// delete the element and copy its value 
//				temp_store += sub_trainingset.get(i).charAt()
				temp_store = sub_trainingset.get(i).substring(0,att_index) + sub_trainingset.get(i).substring(att_index+1,sub_trainingset.get(i).length());
				fetched_sub.add(temp_store);
			}
		}
		return fetched_sub;
	}
	
	// find the best split and return the column number of attribute to be used as test condition
	// in current sub_attribute
	public int find_best_split(ArrayList<String> sub_trainingset)//, String class_att)
	{
		int att_index = 0;
		double max_infogain = 0;
		double temp_infogain = 0;
		String class_att = ""; // create a string value for class attribute
		ArrayList<String> sub_attribute = new ArrayList<String>();
		// convert the training set row to attributes set column first
		for (int i=0; i<sub_trainingset.get(0).length()-1; i++)
		{
			String temp_store = "";
			for (int j=0; j<sub_trainingset.size(); j++)
			{
				temp_store += sub_trainingset.get(j).charAt(i);
			}
			sub_attribute.add(temp_store);
//			System.out.println(sub_attribute.get(i));
		}
		for (int i=0; i<sub_trainingset.size(); i++)
		{
			// class attribute is the last char of the trainingset
			class_att += sub_trainingset.get(i).charAt(sub_trainingset.get(i).length()-1);
		}
		
//		System.out.println(sub_attribute.size());
		// compute the info gain of each attribute
		// and compare them with each other so as to determine which attribute is the condition test
		for (int i=0; i<sub_attribute.size(); i++)
		{
			temp_infogain = Info_Gain(sub_attribute.get(i), class_att);
//			System.out.println(temp_infogain);
			if (temp_infogain > max_infogain)
			{
				max_infogain = temp_infogain;
				att_index = i;
			}
		}
		
		return att_index;
	}
	
	public Node TreeGrowth_preprune(ArrayList<String> sub_trainingset, double THRESHOLD)
	{
//		double THRESHOLD = 0.003;
			if (stop_cond_preprune(sub_trainingset,THRESHOLD) == true)
			{
				Node leaf = new Node();
				leaf.node_att = 1;
				leaf.class_value = Classifier(sub_trainingset);
				// create the leaf node
				return leaf;
			}
			else
			{
				Node root = new Node();
				root.node_att = NONE_LEAF;
				root.class_value = Classifier(sub_trainingset);
				root.test_condition = find_best_split(sub_trainingset);
				// find_best_split returns the column number of the sub_attribute
//				root.test_condition = find_best_split(sub_trainingset, attributes);
				// find the possbile outcome of root, other words, x, o or b					
				boolean x_exist = false;
				boolean o_exist = false;
				boolean b_exist = false;
				for (int i=0; i<sub_trainingset.size(); i++)
				{
					if (sub_trainingset.get(i).charAt(root.test_condition) == 'x')
					{
						x_exist = true;
//						System.out.println("x_exist");
						break;
					}
				}
				for (int i=0; i<sub_trainingset.size(); i++)					
				{
					if (sub_trainingset.get(i).charAt(root.test_condition) == 'o')
					{
						o_exist = true;
//						System.out.println("o_exist");
						break;
					}
				}
				for (int i=0; i<sub_trainingset.size(); i++)
				{
					if (sub_trainingset.get(i).charAt(root.test_condition) == 'b')
					{
//						System.out.println("b_exist");
						b_exist = true;
						break;
					}
				}
				
						// recursively build the tree
						// set the node as a normal node
				if (x_exist)
				{
					ArrayList<String> sub_att_x = fetched_sub_trainingset('x', sub_trainingset);
//					System.out.println(sub_att_x);
					root.leftNode = TreeGrowth_preprune(sub_att_x, THRESHOLD);//,attributes);
//					root.leftNode.dData = 'x';
				}
				if (o_exist)
				{
					ArrayList<String> sub_att_o = fetched_sub_trainingset('o', sub_trainingset);
//					System.out.println(sub_att_o);
					root.rightNode = TreeGrowth_preprune(sub_att_o, THRESHOLD);//,attributes);
//					root.rightNode.dData = 'o';
				}
				if (b_exist)				
				{
					ArrayList<String> sub_att_b = fetched_sub_trainingset('b', sub_trainingset);
//					System.out.println(sub_att_b);
					root.midNode = TreeGrowth_preprune(sub_att_b, THRESHOLD);//,attributes);
//					root.midNode.dData = 'b';
				}
				return root;
			} //else
	}
	
	// to decide if which class should be assignment
	// positive or negative, based on the fact it is determined the leaf node
	public char Classifier(ArrayList<String> sub_trainingset)
	{
		int pos_num = 0;
		int neg_num = 0;
		for (int i=0; i<sub_trainingset.size();i++)
		{
			char class_element = sub_trainingset.get(i).charAt(sub_trainingset.get(i).length()-1);
			if (class_element == 'p')
			{
				pos_num++;
			}
			else
			{
				neg_num++;
			}
		}
		if (pos_num >= neg_num)
		{
			return 'p';
		}
		else
		{
			return 'n';
		}
	}
	
	
	// to decide if the recursion has meet the stop condition
	public boolean stop_cond(ArrayList<String> sub_trainingset)
	{
		// if the length of the element of sub_trainingset equals to 2
		// or all the class element equals to same;
		int other_class = 0;
		int other_attribute = 0;
		// get the last element of the subset, which is class attributes
		// Judgment 1
//		int column = find_best_split(sub_trainingset);
		String first_set = sub_trainingset.get(0).substring(0,sub_trainingset.get(0).length()-1);
		char element = sub_trainingset.get(0).charAt(sub_trainingset.get(0).length()-1);
//		String first_str = 
		// to check if there is another element option
		for (int i=0; i<sub_trainingset.size(); i++)
		{
			// if there are following trainingset 
			if (element != sub_trainingset.get(i).charAt(sub_trainingset.get(i).length()-1))
			{
				other_class ++; 
			}
		}
		// to check if there is another attribute set
		for (int i=0; i<sub_trainingset.size(); i++)
		{
			if (!first_set.equals(sub_trainingset.get(i).substring(0,sub_trainingset.get(i).length()-1)))
			{
//				System.out.println(first_set);
				other_attribute ++;
			}
		}
		// the first case is that each set in the sub_trainingset has the same class value
		// the second case is that each set in the sub_trainingset has the same attributes
		if (other_class == 0)
		{
			//System.out.println("other class");
			return true;
		}
		else if (other_attribute == 0)
		{
			System.out.println("other attribute ");
			return true;
		}
		// if none of the case above, return false
//		else if (sub_trainingset.get(0).length() == 2)
//		{
//			return true;
//		}
		else
		{
			return false;
		}
	}
	
	public boolean stop_cond_preprune(ArrayList<String> sub_trainingset,double THRESHOLD)
	{
		// find the best split of the given matrix
		int att_num = find_best_split(sub_trainingset);
		String attribute = "";
		String class_value = "";
		double info_gain = 0;
		for (int i=0; i<sub_trainingset.size(); i++)
		{
			attribute += sub_trainingset.get(i).charAt(att_num);
			class_value += sub_trainingset.get(i).charAt(sub_trainingset.get(i).length()-1);
		}
		// calculate the information gain based on current attribute set and class set
		info_gain = Info_Gain(attribute,class_value);
		//================================================================================//
		// there are three types of times that will lead the stop_condition to return true//
		// two of them are exactly as stop_cond											  //
		// the other one is that the information gain is under certain threshold		  //
		//================================================================================//
		if (stop_cond(sub_trainingset))
		{
			return true;
		}
		// the condition where information gain is under certain threshold
		else if (info_gain < THRESHOLD)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	// insert the node into a tree
	
	// find the specific node in the tree
//	public Node find_node()
//	{
//		
//	}
	
	// calculate the entropy fragment
	private double Entropy_frag(double probability)
	{
		double entropy;
		entropy = - probability * Math.log(probability)/Math.log(2);
		return entropy;
	}
	
	// a function that is used to calculate the information gain
	// this function takes into a single attribute row and the class 
	// to calculate the information gain
	private double Info_Gain(String attribute, String class_att)
	{
//		System.out.println("load Info_Gain() success");
		// calculate the positive and negative number of the 
		double class_pos_num = 0;
		double class_neg_num = 0;
		// init some of data that would be used
		double x_num = 0; double x_pos = 0; double x_neg = 0;
		double o_num = 0; double o_pos = 0; double o_neg = 0;
		double b_num = 0; double b_pos = 0; double b_neg = 0;
//		System.out.println(x_num + " " + x_pos + " "+ x_neg);
		// compute the numbers that would be used
		for (int i = 0; i < attribute.length(); i++)
		{
			if (attribute.charAt(i) == 'x')
			{
				x_num ++;
				if (class_att.charAt(i) == 'p')//get(i).equals("positive"))
				{
					x_pos ++;
				}
				else
				{
					x_neg ++;
				}
			}
			else if (attribute.charAt(i) == 'o')//get(i).equals("o"))
			{
				o_num ++;
				if (class_att.charAt(i) == 'p')//get(i).equals("positive"))
				{
					o_pos ++;
				}
				else
				{
					o_neg ++;
				}
			}	
			else
			{
				b_num ++;
				if (class_att.charAt(i) == 'p')//get(i).equals("positive"))
				{
					b_pos ++;
				}
				else
				{
					b_neg ++;
				} 
			}
		} // end for (int i = 0; i < attribute.size(); i++)
		class_pos_num = x_pos + o_pos + b_pos;
		class_neg_num = x_neg + o_neg + b_neg;
		double H_x = 0;
		double H_o = 0;
		double H_b = 0;
		if (x_num != 0)
		{
			H_x = Entropy_frag(x_num/attribute.length());
		}
		else 
		{
			H_x = 0;
		}
		if (o_num != 0)
		{
			H_o = Entropy_frag(o_num/attribute.length());
		}
		else 
		{
			H_o = 0;
		}
		if (b_num != 0)
		{
			H_b = Entropy_frag(b_num/attribute.length());
		}
		else 
		{
			H_b = 0;
		}
		double H_X = H_x + H_o + H_b;
		// compute the x under class == positive
		double H_xp = 0;
		double H_op = 0;
		double H_bp = 0;
		if (H_xp != 0)
		{
			H_xp = Entropy_frag(x_pos/class_pos_num);
		}
		else
		{
			H_xp = 0;
		}
		if (H_op != 0)
		{
			H_op = Entropy_frag(o_pos/class_pos_num);
		}
		else
		{
			H_op = 0;
		}
		if (H_bp != 0)
		{
			H_bp = Entropy_frag(b_pos/class_pos_num);
		}
		else
		{
			H_bp = 0;
		}
//		double H_op = Entropy_frag(o_pos/class_pos_num);
//		double H_bp = Entropy_frag(b_pos/class_pos_num);
		double Hp_sum = H_xp + H_op + H_bp;
		// compute the x under class == negative
		double H_xn = 0;
		double H_on = 0;
		double H_bn = 0;
		if (H_xn != 0)
		{
			H_xn = Entropy_frag(x_neg/class_neg_num);
		}
		else
		{
			H_xn = 0;
		}
		if (H_on != 0)
		{
			H_on = Entropy_frag(o_neg/class_neg_num);
		}
		else
		{
			H_on = 0;
		}
		if (H_bn != 0)
		{
			H_bn = Entropy_frag(b_neg/class_neg_num);
		}
		else
		{
			H_bn = 0;
		}
//		double H_on = Entropy_frag(o_neg/class_neg_num);
//		double H_bn = Entropy_frag(b_neg/class_neg_num);
		double Hn_sum = H_xn + H_on + H_bn;
		
		double H_XY = (class_pos_num/attribute.length())*Hp_sum + (class_neg_num/attribute.length())*Hn_sum;
		double entropy = H_X - H_XY;
//		System.out.println("H_X: " + H_X);
//		double entropy = Entropy_frag()
//		////////////////////////////////////////////
//		System.out.println(x_num + " " + x_pos + " "+ x_neg);
//		System.out.println(o_num + " " + o_pos + " "+ o_neg);
//		System.out.println(b_num + " " + b_pos + " "+ b_neg);
//		System.out.println("class pos: "+ class_pos_num);
//		System.out.println("class neg: "+ class_neg_num);
//		////////////////////////////////////////////
		
//		if (entropy > 1)
//		{
//			System.out.println("info gain: " + entropy);
//		}
		return entropy;
	} // end double info_gain()
	
}

