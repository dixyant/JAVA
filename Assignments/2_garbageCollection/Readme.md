##### 26 Nov 2021 - 03 Dec 2021

# Garbage Collection 

Garbage Collection is process of reclaiming the runtime unused memory automatically. Java programs compile to bytecode that can be run on a Java Virtual Machine, or JVM for short. When Java programs run on the JVM, objects are created on the heap, which is a portion of memory dedicated to the program. Eventually, some objects will no longer be needed. The garbage collector finds these unused objects and deletes them to free up memory.

You can use methods like `free()` in C, and `delete()` in C++ to perform Garbage Collection. In Java, garbage collection happens automatically during the lifetime of a program. This eliminates the need to de-allocate memory and therefore avoids memory leaks.

There are various ways in which the references to an object can be released to make it a candidate for Garbage Collection. Some of them are:

##### 1)  By making a reference null


```bash
  Student student = new Student();
  student = null;
```
##### 2) By assigning a reference to another
```bash
  Student studentOne = new Student();
  Student studentTwo = new Student();
  studentOne = studentTwo; 
```

##### 3) By using an anonymous object
```bash
  register(new Student());
```

### Benefits of Java Garbage Collection

The biggest benefit of Java garbage collection is that it automatically handles the deletion of unused objects or objects that are out of reach to free up vital memory resources.

