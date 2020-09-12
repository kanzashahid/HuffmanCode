# HuffmanCode

# Concept 

Even though hard drives are getting bigger, the files we want to store seem to keep pace with that growth which makes today's gargantuan disk seem too small to hold everything.
One technique : compress the files.
We may be able to "abbreviate" the contents in such a way to take up less space yet maintain the ability to reconstruct a full version of the original when needed. 
Faster transfer of data

# Huffman Code 
The Huffman encoding scheme takes advantage of the disparity between frequencies and uses less storage for the frequently occurring characters at the expense of having to use more storage for each of the more rare characters. 

Some characters may only require 2 or 3 bits and other characters may require 7, 10, or 12 bits. 
The savings from not having to use a full 8 bits for the most common characters makes up for having to use more than 8 bits for the rare characters and the overall effect is that the file almost always requires less space.

# Working

The example we’re going to use during this presentation is encoding the particular string “Hello world’’ .
Using the standard ASCII encoding, this 11- character string requires 11*8 = 88 bits total.
The string “Hello world’’ would be encoded in ASCII as 72 101 108 108 111 32 119 111 114 108 100 . 
Although not easily readable by humans, it would be written as the following stream of bits (each byte is boxed to show the boundaries):
Using three bits per character, the encoded string requires 33 bits instead of the original 88 bits, compressing up to 38% of its original size.

# Usage

To use the project you would need an IDE that supports GUI. Download the project and run in the IDE. 
