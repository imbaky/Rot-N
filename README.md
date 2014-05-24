Rot-N
=====

GUI in Java to encrypt/decrypt Rot-N messages

###Introduction

It is said that Julius Caesar, jealous of the ever increasing popularity of the Spartan Races, sent le gionaries to Sparta to sabotage and destroy the Races. His secret army had in its possession a message to give to the Roman spies currently undercover in Sparta. This message exposed Caesar’s detailed plans to sabotage the Spartan
Races. As these plans were highly confidential, Julius Caesar himself devised a strategy to encrypt his message
so that only the intended receiver, with the proper decryption key, could decipher the message. This simple encryption
mechanism, today known as “ROT13” or “Caesar cipher” in his honor, is a simple letter substitution cipher that replaces every letter of a message with the letter 13 positions after it in the alphabet.

For example, the letter ‘A’ would be replaced by ’N’ (because ‘A’+13 = ‘N’); 
note that the alphabet is considered cyclic, so that once the ‘z’ or ’Z’ have been reached, we start counting back from the letters ‘a’ or ‘A’.
<br/>
```
For example, using ROT13, the message:  Secreti Spartanam Cursus perdere!

would be encrypted as:                  Frpergv Fcnegnanz Phefhf creqrer!
```
because: S+13= F, e+13 = r, c+13 = p, ...

ROT13 is still being used today, but only when weak encryption is necessary 

(e.g. to hide bunch lines in jokes or to hide answers to puzzles).
 
In the standard ROT13, only the letters are encrypted, other characters such as punctuations or digits are left unchanged.
However several variations exist. In particular, a more general version of ROT13 is ROT-n where instead of adding 13 to a letter, another value (n) is used. The value of n can be a simple integer or a more complex and difficult to guess function.

<br/>
```
For example, using ROT5, the sentence: Secreti Spartanam Cursus perdere!

would be encrypted as:                 Xjhwjyn Xufwyfsfr Hzwxzx ujwijwj!
```

[Wikipedia](http://en.wikipedia.org/wiki/ROT13)
