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




