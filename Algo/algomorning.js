class Node
{
    constructor(value)
    {
        this.next=undefined;
        this.value=value;
    }
};

class List
{
    constructor()
    {
        this.head=undefined;
    }

    /* Determine whether the list is empty. */
    IsEmpty()
    {
        return this.heads==undefined
    }

    /* Insert a node with the given value to the end of the list */
    PushBack(value)
    {
        if(!this.head)
        {
            this.head=new Node(value);
            return;
        }
        let node=this.head;
        while(node.next)
        {
            node=node.next;
        }node.next=new Node(value)
    }   

    /* Insert an array of nodes with the given values to the end of the list. */
    PushBackN(arr)
    {
        /* Your Code Here */
    }

    Iterate(fn)
    {
        for(let node=this.head;node;node=node.next){fn(node.value);}
    }
};

let test_data1=123;
let test_data2=234;
let test_data3=345;
let test_data4=[111,222,333,444,555];

/* Create our list */
let list=new List();
/* Insert nodes into the list: */
list.PushBack(test_data1);
list.PushBack(test_data2);
list.PushBack(test_data3);
/* Insert array of nodes into the list: */
list.PushBackN(test_data4);
/* Iterate our list, so we can see our node values */
list.Iterate(value=>console.log(value));
/* Expected output: */
/*
    123
    234
    345
    111
    222
    333
    444
    555
*/


class Node
{
    constructor(value)
    {
        this.next=undefined;
        this.value=value;
    }
};

class List
{
    constructor()
    {
        this.head=undefined;
    }

    Iterate(fn)
    {
        for(let node=this.head;node;node=node.next){fn(node.value);}
    }

    /* Return the second to last node's value in the list */
    SecondToLast()
    {
        let node=this.head;
        while(node.next.next){
            node=node.next;
        } return node.value;
    } 

    /* Remove a node whose value matches the given value */
    /* ( You will need to fix .next pointers too! ) */
    RemoveValue(value)
    {
        let node=this.head;
        let prev=null;
        while(node){
            if(node.value==value){

                return;
            }
            prev=node;
            node=node.next;
            
        }
    }

    /* Inserts a new node before a node whose value is the search_value. */
    /* Example: */
    /*
        Before:
        10
        30
        40

        Prepend(20,30)

        After:
        10
        20
        30
        40
    */
    Prepend(new_value,search_value)
    {
        let node=this.head;
        while(node) {
            if(node.value==search_value)
        }
    }
};
/*****************************************************************************/
/* Code Tests Below */
/*****************************************************************************/

/* Creates our list */
let list=new List();

/* ( Use your solution from day 1 for this to work! ) */
/* Remember, it just shoves all of these into our list! */
list.PushBackN([111,222,333,444,555,666]);

console.log(list.SecondToLast()) /* Expected: 555 */

list.RemoveValue(333); /* No Output */

/* I'm a freebie, don't delete me! */
list.Iterate(value=>console.log(value));
/*
    Expected Output after RemoveValue(333):
    111
    222
        <-- this was 333
    444
    555
    666
*/

list.Prepend(333,444);

/* I'm a freebie, don't delete me! */
list.Iterate(value=>console.log(value));
/*
    Expected Output after Prepend(333,444):
    111
    222
    333 <- 333 should be back
    444
    555
    666
*/





class BSTNode
{
	constructor(value)
	{
		this.left=undefined;
		this.right=undefined;
		this.value=value;
	}
};

class BST
{
	constructor()
	{
		this.root=undefined;
	}

	/* I'm just here to print your BST In-Order. */
	Log(node,fmt="")
	{
		if(!node) return fmt;
		fmt=this.Log(node.left,fmt);
		fmt+=node.value+"->";
		fmt=this.Log(node.right,fmt);
		return fmt;
	}

	/* Time Complexity: O(N) */
	/* Ordering: Node, Left, Right */
	/* Description: Traverse / Iterate the tree Pre-Order. */
	/* console.log(node.value) each node's value */
	/* When To Use: When you need to explore ROOTS before LEAVES */
	PreOrder(node)
	{
		if(!node) return;
		/* Call me recursively */
		/* Call me recursively */
	}

	/* Ordering: Left, Node, Right */	
	/* Time Complexity: O(N) */
	/* Description: Traverse / Iterate the tree In-Order. */
	/* console.log(node.value) each node's value */
	/* When To Use: When you need to explore the tree INORDER */
	InOrder(node)
	{
		if(!node) return;
		/* Call me recursively */
		/* Call me recursively */
	}

	/* Left, Right, Node */
	/* Time Complexity: O(N) */
	/* Description: Traverse / Iterate the tree Post-Order. */
	/* console.log(node.value) each node's value */
	/* When To Use: When you need to explore LEAVES before ROOTS */
	PostOrder(node)
	{
		if(!node) return;
		/* Call me recursively */
		/* Call me recursively */
	}
};
/*****************************************************************************/
/* Code Tests Below */
/*****************************************************************************/
let bst=new BST();
bst.root=new BSTNode(100);
bst.root.left=new BSTNode(50);
bst.root.left.left=new BSTNode(25);
bst.root.left.right=new BSTNode(75);
bst.root.right=new BSTNode(150);
bst.root.right.left=new BSTNode(125);
bst.root.right.right=new BSTNode(175);

console.log(bst.PreOrder(bst.root)); 	/* Expected: 100 50 25 75 150 125 175 */
console.log(bst.InOrder(bst.root)); 	/* Expected: 25 50 75 100 125 150 175 */
console.log(bst.PostOrder(bst.root));   /* Expected: 25 75 50 125 175 150 100 */





class MinHeap
{
    constructor()
    {
        this.data=[null,10,40,20,60,50,30,70];
    }

    /* Description: Inserts a value into the heap, maintaining order. */
    /* Instructions: */
        /* 1. push the value to the end of the array.*/
        /* 2. Iteratively swap the new number with its parent value while it is */
        /* smaller than it's parent. */
    /* Time: O(log n) */
    /* Space: O(1) */
    Insert(value)
    {
        this.data.push(value);

        let index=this.data.length -1;

        while(index>0){
            let parent = Math.floor(index/2);
            let temp=this.data[parent];
            if(temp<this.data[index]){
                temp=
            }
        }
    }

    /* Description: Returns the smallest value in the heap without removing it. */
    /* Time: O(1) */
    /* Space: O(1) */
    Min()
    {
        /* Your Code Here */
    }

    Log()
    {
        let fmt="";
        let len=this.data.length-1;
        let tabs=0;
        for(;len;len>>=1,tabs++){}
        for(let i=1;i<this.data.length;i<<=1,tabs--)
        {
            let to=(i<<1)-1;

            for(let j=0;j<to;j++)
            {

            }
        }
        console.log(fmt);
    }
};

let heap=new MinHeap();
heap.Insert(5);
heap.Log(); /* Expected: 5,10,40,20,60,50,30,70 */
console.log(heap.Min()); /* Expected: 5 */




class MinHeap
{
    constructor()
    {
        this.data=[null,10,40,20,60,50,30,70];
    }

    /* Description: Extracts the min number in the heap and reorders it */
    /* so the next min is ready for extraction */
    /* Time: O(log n) */
    /* Space: O(1) */
    /*
        Instructions:
        1. Save the min.
        2. Pop last num and set it as the first index.
        3. Iteratively swap the old last node that is now at idx1 with it's
        smallest child IF the smallest child is smaller than it.
    */
    Extract()
    {
        let min=this.data[1];
        let last=this.data.pop();
        this.data[1]=last;
        let parentIdx=1;
        while(parentIdx < this.data.length-1){
            let childA=2 * parentIdx;
            let childB=(2*parentIdx)+1;
            let smaller=childA;
            if(childA >= this.data.length){
                break;
            }
            if (childB < this.data.length){
                if(this.data[childB]<this.data[childB]){
                    smaller-childB;
                }
            } if(this.data[smaller]<this.data[parentIdx]){
                let temp = this.data[smaller];
                this.data[smaller]=this.data[parentIdx];
                this.data[parentIdx]=temp;
                parentIdx=smaller;
            }else{
                break;
            }

        } return min;
    }

    Log()
    {
        let fmt="";
        for(let i=1;i<this.data.length;i++)
        {
            fmt+=this.data[i]+",";
        }
        fmt=fmt.substring(0,fmt.length-1);
        console.log(fmt);
    }
};

let heap=new MinHeap();
console.log(heap.Extract()); /* Expected: 10 */
heap.Log(); /* Expected: 20,40,70,60,50,30 */
console.log(heap);