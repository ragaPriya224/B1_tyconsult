https://www.geeksforgeeks.org/collections-in-java-2/

![image](https://user-images.githubusercontent.com/90038032/215161987-fec8834d-5574-459d-91b7-3699c784612e.png)

![image](https://user-images.githubusercontent.com/90038032/215162041-3421fb2f-07c2-466f-9c3e-42f1478a21cc.png)

![image](https://user-images.githubusercontent.com/90038032/215162077-48b51619-f512-43cf-b6ed-f9e5f603875a.png)

https://www.youtube.com/watch?v=v9zg9g_FbJY&list=PLd3UqWTnYXOkVR3OR9UZGyEt9RFUbaTMZ&index=13


Collections

ANALOGY:

Assume that , we're going to outing on a weekend. and before going out, our mom asks us to buya list of groceries
Let's assume we went to a mall.
First, we entered a dress shop,
   we'll buy unique dresses.that is, we won't buy same design , same colour dresssess again and again. we don't prefer duplicate dress. we prefer unique dresses
Next, we entered a groceries shop,
   Yeah,If we forget items, we can't manage our mom :P  . so now, we were okay with duplicates. i.e., buying same milk packet twice, same choclate, same weight again 
    and again and buying 20 rupee maggi packet thrice.. we were totally okay with duplicates
 Then, we were so tired,so we entered a cafeteria
    if you see menu, it will have food name and food price.. food item name will not be repeated(not duplicated), but price can be duplicated.for eg: tea and coffee
      might be of same price. 
So, see during shopping, once we required, duplicates sometimes we preferred unique items..sometimes we were okay with food prices be duplicated
----------------------------------------------------------------------------------------------------------------------------------
    
  
   
COLLECTIONS ?  -> REPRESENTS A GROUP OF ENTITIES eg: STUDENT GROUP, ETC

 KEY Interface ->  9 
---------------
1. collection(I)
2. List(I) 
3. set(I)
4. sortedSet(I)
5. navigableSet(I)
6. queue(I)
7. map (I)
8. sortedMap(I)
9. navigableMap(I)


// dress shop -> unique items
// grocery shop -> duplicate items
// hotel -> burger & coke 
// hotel -> menu card-> price and food item


1. Collection(I)

 super Interface / Root interface
-> defines most common methods used for any collection object
-> there is no concrete class that implements collection interface

(Concrete class -> In other words, it's a full implementation of its blueprint.
As such, it has no unimplemented method)
https://www.baeldung.com/java-concrete-class


2.List(I)
// grocery shop -> duplicate items
// hotel -> masala dosa & coffee

when you want the insertion order to be maintained, and it must allow duplicate elements means, 
then we should go for list interface


Collection(I)
|
List(I)

|
ArrayList    LinkedList(1.2)     Vector & Stack(1.0)  -> old/legacy classes

3. Set(I)

// dress shop -> unique items
IF we want to represent group of individual objects as single entity where 
*  it won't allow duplicate elements 
* insertion order won't be maintained 

Collection(I)
|
Set(I)  
|
HashSet(class)
|
LinkedHashSet


            List          set
duplicate    yes          no
ins order    yes          no
---------------------------
4. sortedSet(I)

Collection(I)
|
Set(I)
|
SortedSet(I)
|
NavigableSet(I)
|
TreeSet(Implementation class)

* duplicate not allowed
*insert according to sorting order

--------------------------
5.  navigableSet(I)

* it is a child of sorted set
* several methods for that navigation purpose
* implementation class of navigable set is treeset


6. : QUEUE(I)

represent group of individual objects prior(before ) to processing, we can go for queue concept

Collection(I)
||

QUEUE(I)



PRIORITY QUEUE        BLOCKING QUEUE -> LINKED, PRIORITY 

WE WERE representing a group of individual objects as a single entity 
----------------------------

7. MAP(I)

if we want to represent a group of objects as key , value pair -> then go for map

Key              value 

vegBriyani      100
chickenBriyani   200
coffee            50 

rollID   name

101   anu   -> entity 
102   aravind
103    john

 pair of key value is known as entity 

not child interface of collection 

Map(I)

hashMap    weakHashMap IdentityHashMap Hashtable(dictionary)
linkedHashMap

8.sortedmap(I)  ->

insert a key value pair according to sorting order
impl classs -> treemap


9.navigable map(I)

navigation purposes
child of sorted map

----------------------IN DEPTHJ NOTES---------------------

Arraylist:
dup ok
order ok
heterogenous data allowed
null insertion possible 
DS: resizable/growable array 
initial capacity of ten.

https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html
Constructor:

ArrayList al = new ArrayList();
ArrayList al = new ArrayList(100);


