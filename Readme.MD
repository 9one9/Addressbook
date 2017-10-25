## Address Book Application


A java application that holds contacts in a simple address list. GUI provided.

Made by Brandon Rayson

###Changelog

####9/10/2017
Intialized Readme

Corrected Grid Layout of Java GUI

Changed 'Go' to "Add Contact"

9/11/17

Contacts can be formally added to arraylist. Created process class to hold insertion methods.

9/12/17

How can i create objects outside of main and add to arraylist

Created Home GUI in IntelliJ for future editing.

10/24/17

I hit a wall. After being on the backburner for awhile, i'm still searching for a method to add contact wothout the program terminating.
An easy patch was to just use thread.sleep, until i fully understood concurrency with Swing. However each new contact would need a name in the complete array list and that is problematic.
The main method formally adds the contact, but with what reference? 
