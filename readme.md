# Programming II

## Lab 2: Strings and Arrays

In this lab, you will practice for-each loops (aka enhanced for loops), array operations, and String operations.

This lab is used in CS 222 at Saint Mary's College of California. Written by Dr. Sarah Roscoe in 2024.

# Instructions

1. Clone this lab from Github. Use this link: <https://github.com/sroscoe2/CS222-Lab-02.git> Refer to Lab 1 if you need a refresher for how to do so. REMEMBER: when importing, name your folder `firstnameLI-CS222-Lab-02`

## Beginning.java

2. [Explanation](#for-each-loopsenhanced-for-loops) [Hints](#explaining-code) Open `Beginning.java`. Look at the `findNumberInArray()` method. In the comment space provided, write out in plain words what the loop is doing.

3. [Hints](#getting-even-numbers) Look at `getEvenNumbers()`. Using a for-each loop and the modulo `%` operator, implement the method so it returns an array full of even numbers, 0 through 10.

4. [Explanation](#doing-things-with-strings) Look at `findLetterInString()`. Write a for-each loop that goes through the provided `String` and figure out if a given letter `target` is in that String. Use `s.toCharArray()` to convert the string to an array, then examine the equality of individual `char`s.

5. [Explanation](#explaining-code) Write comments for your method. From this point forward, assume this is a requirement for every piece of code you write.

6. Run `BeginningTests.java` and ensure all test cases pass. Refer to Lab 1 for instructions on running JUnit tests.

## Middle.java

7. [Explanation](#array-re-allocation) Open `Middle.java`. Look at the method `splitToLetters()`. Its parameters are two Strings, `a` and `b`. We want to put the letters of both strings into the same array, but when we run it, it throws an exception. Why is that? Write your answer in comments in the `splitToLetters()` method.

8. [Hints](#re-allocation-hints) Implement `reallocate(char[] c, int s)` which takes in a too-small array `c`, and return an array with size increased by amount `s`, and with the elements from `c` copied over.

9. [Explanation](#copying-characters-over) Call `reallocate()` in `splitToLetters()`. For the second argument, tell it to increase the size of `result` by the size of `b`. The `splitToLetters()` method should now work as intended.

10. Run `MiddleTests.java` and ensure all test cases pass.

## End.java

11. [Explanation](#sebald-code) [Hints](#sebald-code-hints) Open `End.java`. Read up on Sebald code, then implement `decode()` to return the original message String from the coded one.

12. Run `EndTests.java` and ensure all test cases pass.

## Finishing Up

13. Zip your project folder and turn it into Canvas. Refer to Lab 1 if you need a refresher for how to do so.

# Explanations

## Beginning

### For-Each Loops/Enhanced For Loops

For-each loops (also called *enhanced* for loops) are a different kind of loop than what we talked about in the last lab. Whereas standard for loops have *initialization*, *condition*, and *update* steps, for-each loops are designed to *iterate* (go through) through a collection, and do not require specification of those components.

What's a collection? Basically, any group of things. An array is a type of collection: it's ordered, meaning one object appears before another, like in the list `[1, 2, 3, 4, 5]`. There are other types of collections that may be used. We will also have a chance later on in the semester to define our own kinds of collections. What matters is that we know how to go through a collection in an orderly manner.

Let's look at how we summed an array, from last time (the for loop version):

```java
int sum = 0;
for (int i=0; i<arr.length; i++){
    sum += arr[i];
}
```

Since `arr` is a *collection*, we can also use a for-each loop to go through it. Let's look at the code, then talk about it:

```java
int sum = 0;
for(int num : arr){
    sum += num;
}
```

What's happening here? Let's read it out loud, and write a sort of verbal explanation for our code:

- We start the sum at 0 (In code: we have initialized a sum variable to 0).
- For each number in our array `arr`, we add the number to our sum.

And that's it! It's a simple for loop, but to me it looks a lot cleaner than the standard for loop.

In standard for loops, we need to say *how* we are going to count through the loop. Enhanced for loops handle the *how*, as long as we give it something it knows how to process. This doesn't only work for arrays. It works for any sort of collection that supports iterating: `Lists` (including `ArrayList`s), Strings, and other things that support Java's `Collection` interface can all use enhanced for loops.

As an aside, you may remember doing something similar in Python:

```py
sum = 0
for num in arr:
    sum += num
```

It's the same sort of process. We just have to write it differently in Java.

Next, you'll practice explaining your code, and writing a for-each loop of your own.

[Go back to the instructions](#beginningjava)

### Explaining Code

When we write code, it's important that we know what we're doing, and it's important to be able to tell others what your code is doing.

To that end, you should get in the practice of saying "what did I just write?" to yourself.

Then, once you can say out loud to yourself "my code did \[this\]", you can *write it down* in your code. We do this with *comments*, which are written pieces of code that don't get compiled. We can write whatever we want in comments, including even lines of code that we don't want to have executed. It's a good practice to start writing comments from the very beginning of a file.

We write comments in Java in three ways:

1. Single-line comments `// xyz`
2. Multi-line comments `/*  xyz */`
3. Javadoc comments `/** xyz */`

*Single-line comments* are used to write comments only on one line. Anything before the `//` will be compiled (so you could have some code *before* a single line comment).  Just keep in mind readability. If text goes off the visible area of the screen, it can be hard to scroll to the side to read it. Single line comments are useful for short explanations or hints about your code.

Single-line comments may be triggered for a selected line or group of selected lines by typing `ctrl + /` (`cmd + /` on Mac).

*Multi-line comments* span multiple lines. They're useful if you have longer, more in-depth explanations that help others understand what you're doing. Here's an example:

```java
/*
* TODO Write in words: what does this method do?
* 
*/
```

*Javadoc comments* are a special kind of comment that can display information about your code. It helps to create *documentation*, which tells others not only what your code does generally, but you can also make it say specifically what each element of your code is doing. If you go to the Java documentation, most pages you'll see online were created using detailed Javadoc comments. It's a good habit to get into using this, especially once you start writing more advanced programs. Javadoc comments can also be viewed in your IDE if you hover over a type name (starts with a Capital letter) or method.

To solve Problem 2, go back to the [explanation of enhanced for loops](#for-each-loopsenhanced-for-loops) and see what I wrote to explain the summing method. Write what the method `findNumberInArray()` is doing in regular words. It won't be the same as what I wrote, but it will start with "For each..." Ask the instructor or a tutor if you need help.

[Go back to the instructions](#beginningjava)

### Getting Even Numbers

The modulo operator `%` returns the *remainder* of any division. `a % b` is read "a modulo b", or "the remainder of a divided by b". 8%5 will give 3, since 5 goes into 8 one time, with a leftover amount of 3.

You can use this operator to easily figure out if a number is divisible by another. To find out, for example, that a number is even (divisible by 2), you can type `a % 2`.

[Go back to the instructions](#beginningjava)

### Arrays

Arrays are containers that we can iterate through. They're collections of elements.

They are similar to a `list` in Python. However, there is one crucial difference! In Python, you could put anything in a list. You could have an integer, next to a float, next to a String, next to another list, like this:

```python
[3, 5.9, "hello class", [4, 5, 6]]
```

This doesn't fly in Java, because of something called *type safety*. This means that everything in an array *must be the same type!* It's similar to what we discussed about variables in the last lab: what you declare is what will always be there. You can't change the type of a variable. You can't have different kinds of things in a list.

Here's how we declare (left hand side of `=`) and initialize (right hand side of `=`) an array in Java:

```java
Typename[] variableName = new Typename[number];
```

Where `number` is an integer, the size you want the array to be.

Remember, only primitive types (see Lab 1) get type names that start with lowercase. Everything else gets a type name that starts with a capital letter.

We need the `new` keyword in initializing the array, because Java needs to know that it should reserve a spot in memory to save this information in. We need the `number` because it

So let's say we want an array of integers, of length 5. Here's how we do that:

```java
int[] arr = new int[5];
```

Note that we don't always need `int` as the type. The array can store whatever type we want. This one happens to be set up to hold `int`s.  If we wanted an array of `String`s, we could say:

```java
String[] arr = new String[3];
```

And that gives us an empty array ready to hold `String`s.

How do we access things in arrays? Indexing! We briefly talked about it in the last Lab, but we can use *square brackets* to access the indices of the array. So if my array `arr` looks like `[101, 102, 103, 104, 105]`, I can say `arr[4]` to get the value 105.

Remember, we count starting at 0. So `arr[0]` is 101, and `arr[5]` would give us an error, even though our array has 5 things long. We can always get the last element in an array with `arr[arr.length-1]`, and that -1 is important.

Note that using something like `arr[-1]`, which you could do in Python, does not work here.

To replace a value in an array, first we need to know what index we're replacing. Then, we can just use an equal sign (just one, like `=`) to assign a new vaue.

#### Array Re-allocation

Arrays are only as big as we tell them to be. When we initialize an array, like `int[] arr = new int[10]`, we are saying we want the array to hold 10 elements. We cannot expand that later: `arr` will *always* only hold 10 elements.

If we need more space, we need to make a whole new array with a bigger size. That can be done by a process to allocate additional space.

[Go back to the instructions](#middlejava)

##### Re-allocation Hints

Your job in `reallocate()` is to return a new array with an increase in size from the original. Here's some hints to get you there:

1. Declare and initialize the new array. It should have a size of `c.length * s`, where `s` is the amount given to increase the size by.
2. Have a for loop (traditional, probably, not an enhanced for loop) that goes through the length of `c`.
3. At each point in the for loop, assign your new array (I'll call it `c2`, but you could name it anything) value by saying `c2 = c[i]`.
4. Once you've gone through `c`, return the new array.

[Go back to the instructions](#middlejava)

##### Copying Characters Over

When we are copying the things in `b`'s charArray to `result`, keep in mind that we need two frames of reference:

1. The frame of reference for `result`, because we want to add things after position `a.length()`
2. The frame of reference for `b`'s char array. We start counting at 0. 

How to do both of these at once? One possibility is to start counting `i` at 0, then just insert the items of `b`'s char array to `a.length() + i`. 

[Go back to the instructions](#middlejava)

### Strings

A `String` is a type of data structure that stores text, like this: `"hello this is a String."` A `String` is different from a `char`, which consists of single characters (and letters). In Java, `chars` are defined by *single quotes* `' '`, which leaves `String`s to use double quotes `" "`, This is important. In Python, if you used either single or double quotes for a `str`, it didn't care. But Java cares.

You'll be using some of the common `String` methods in these problems. But there are more! Go check out the documentation [here](https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/lang/String.html) for all the things it can do.

#### Creating

To make a String, you have a few options: initialize it like you would a primitive type, or as a reference type.

Here's how we initialize it like a primitive:

```java
String s = "This is my String";
```

But with reference types, we need to use the `new` keyword to allocate memory! And a `String` is not a primitive type. Why's that?The short answer is, `String`s are special. There's enough support that allows them to be initialized with just the equal sign. This won't be the case for other reference types, though -- so be careful.

#### Doing things with Strings

Now we'll briefly talk through some things Strings can do. Note that for examples discussed here, the variable name for a string is `mystring`. It could be anything. The point is that we have a `String` variable, and you can call the following *dot operations* on that variable.

- **Find a character at an index.** Instead of doing `mystring[i]` to get the character at a given position `i`, which Python would let us do, we have to use a method. Instead, we can say `mystring.charAt(4)` to get the 4th indexed (5th actual) character in the String.
- **Convert to array.** We can get an array of `char`s by calling `mystring.toCharArray()`. That converts the String `"hello"` to the array `['h','e','l','l','o']`. You'll use this for Problems 4 and 7.
- **Split up by a character.** What if you have a long string like `"4,5,6,7,8"` or `"Hello I would like each word of this to be separate"`? If you want to split it into an array of separate `String`s (also called *tokens*), you can use `mystring.split()`. But you need to add an *argument* inside the parentheses to specify the character you want to use for splitting the `String`. Here are examples from the two Strings above:

```java
String commaSep = "4,5,6,7,8";
String spaceSep = "Hello I would like each word of this to be separate";
String[] commaSplit = commaSep.split(',');
// csvSplit = ["4", "5", "6", "7", "8"]
String[] spaceSplit = spaceSep.split(' ');
// spaceSplit = ["Hello", "I", "would", "like", 
//          "each", "word", "of", "this", 
//          "to", "be", "separate"]
```

- **Find if something is contained.** Let's say we want to know if `"car"` is contained in `"racecar"`, or if `"man"` is in `"portmanteau"`. We can do that with `mystring.contains(substring)`. So that would look like:

```java
String bigstring = "portmanteau";
boolean b = bigstring.contains("man");
```

- **Getting a substring.** In Python, you could create a substring by using slices `mystring[a:b]`. Java does it with the method `substring()`. It takes up to two parameters. Calling `substring(beginIndex)` will return a String that starts at the index given and goes to the end of the String. Calling `substring(beginIndex, endIndex)` will return a String that starts at `beginIndex` and goes to `endIndex`-1.

```java
String s = "abcdef123456";
String numbers = s.substring(6); // "123456"
String letters = s.substring(0,6);
```

- **Combine one String with another.** This is known as *concatenation*. When two `Strings` get concatenated, one gets pushed against the other. So if one is `"hello,"` and the other is `"class!"` concatenating them would give `"hello,class!"`. Concatenating doesn't add any whitespace, so keep that in mind. To "add on" to a string, you can use the `+` operator, and assign with the `=` operator. You can shortcut that by using the `+=` operator, too:

```java
String a = "Aa";
String b = "Bb";
String ab = a+b; // concatenates a and b: "AaBb"
// can add even more to ab:
ab += "123";
// now ab is "AaBb123"
```

[Go back to the Beginning instructions](#beginningjava)

[Go back to the Middle instructions](#middlejava)

### Sebald Code

In the book series *A Series of Unfortunate Events*, there is a code that is characterized by the following:

- The code begins after a bell is rung.
- The first word after the bell, and every 11th word after that, is part of the coded message.
- There are 10 ignorable words between each message word.
- The message ends when a bell is rung again.

[Go back to the instructions](#endjava)

### Sebald Code Hints

Take the following steps to complete `End.java` and decode the message:

1. You are given a long String that is the entire message. Use a loop to iterate through the string. You may choose any kind of loop you wish.
2. Perhaps use an integer counter variable to keep track of the number of words.
3. Perhaps use a boolean variable to ensure whether the bell has rung (beginning of message or end).
4. Before the loop, setup an empty String (`""`) to hold the coded message.
5. Split the string with `.split()`, and in the parenthesis give it a String containing a space  `" "`. Perhaps also use `.toLowerCase()` to convert the whole string into lower case. Assume you will not be given a String with punctuation.
6. If a word is "ding", start the counter at 0.
7. The word after "ding" is part of the coded message. Save it to your secret message by concatenating it with `+=`
8. Every 11th word after the bell has been rung, save the current word to the secret message.
9. Return the secret message.

[Go back to the instructions](#endjava)
