Rot-N
=====

GUI in Java to encrypt/decrypt Rot-N messages



Page 1 of 3
COMP 249 Assignment 4 Winter 2014
Deadline:
Friday, April 11 2014, midnight.
Evaluation:
5% of final mark.
Late Submission:
No late assignments accepted for credit
Teams:
The assignment can be done individually or in
teams of 2 – both students must be from the
same lecture section.
Purpose:
The purpose of this assignment is to help you pr
actice Graphical User Interfaces and Linked Lists.
In this assignment, you will write 2 programs.
Program 1 (15pts): The Demise of the Spartan Races...
It is said that Julius Caesar, jealous of the ever
increasing popularity of the Spartan Races, sent le
gionaries to Sparta
to sabotage and destroy the Races. His secret army
had in its possession a message to give to the Rom
an spies
currently undercover in Sparta. This message expos
ed Caesar’s detailed plans to sabotage the Spartan
Races. As
these plans were highly confidential, Julius Caesar
himself devised a strategy to encrypt his message
so that only the
intended receiver, with the proper decryption key,
could decipher the message. This simple encryption
mechanism,
today known as “ROT13” or “Caesar cipher” in his ho
nor, is a simple letter substitution cipher that re
places every
letter of a message with the letter 13 positions af
ter it in the alphabet. For example, the letter ‘A
’ would be replaced
by ’N’ (because ‘A’+13 = ‘N’); note that the alphab
et is considered cyclic, so that once the ‘z’ or ’Z
’ have been
reached, we start counting back from the letters ‘a
’ or ‘A’.
For example, using ROT13, the message:
Secreti Spartanam Cursus perdere!
would be encrypted as:
Frpergv Fcnegnanz Phefhf creqrer!
because: S+13= F, e+13 = r, c+13 = p, ...
ROT13 is still being used today, but only when weak
encryption is necessary (e.g. to hide bunch lines
in jokes or to hide
answers to puzzles).
In the standard ROT13, only the letters are encrypt
ed, other characters such as punctuations or digits
are left unchanged.
However several variations exist. In particular, a
more general version of ROT13 is ROT-n
where instead of adding 13 to a letter, another value (n) is used. The value of n
can be a simple integer or a more complex and diffi
cult to guess function.
For example, using ROT5, the sentence: Secreti Spartanam Cursus perdere!
would be encrypted as:                 Xjhwjyn Xufwyfsfr Hzwxzx ujwijwj! 
