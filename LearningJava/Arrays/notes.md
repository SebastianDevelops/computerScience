### Arrays

An array is a collection of data, with a specific data type. An array of a specfic data type can only hold that data type.

Delcaring an array makes that array get placed in the stack(until you have a reference to point it to).
The actual opject gets created in the heap.

In an array, you can either mention the size or put the values of the object in directly.

This object gets created at runtime. This is known as dynamic memory allocation. This means that the array is assigned to memory at runtime.

Array objects are stored on the heap so they may not be continuous, it depends on the JVM.

**Arrays in java are 0 indexed**

### Multidimensional Arrays:
 This is basically an array of Arrays. Each array within the main array can be stored in some different part within the heap. 
 
 Each index of this array, is an array itself. eg arr[1] would give us the second array within the parent array. 2D arrays are made up of columns and rows basically.

**The column size is not mandatory.**

**Using .length in this scenario gives you the number of rows.**

### Keywords:

- **Dynamic Memory Allocation**: Memory is allocated at runtime.