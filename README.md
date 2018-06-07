# phoneSearch-MOOC-
practice application to manage phone numbers and addresses.
<pre>phone search
available operations:
 1 add a number
 2 search for a number
 3 search for a person by phone number
 4 add an address
 5 search for personal information
 6 delete personal information
 7 filtered listing
 x quit

command: <font color="red">1</font>
whose number: <font color="red">pekka</font>
number: <font color="red">040-123456</font>

command: <font color="red">2</font>
whose number: <font color="red">jukka</font>
  not found

command: <font color="red">2</font>
whose number: <font color="red">pekka</font>
 <font color="red">040-123456</font>

command: <font color="red">1</font>
whose number: <font color="red">pekka</font>
number: <font color="red">09-222333</font>

command: <font color="red">2</font>
whose number: <font color="red">pekka</font>
 040-123456
 09-222333

command: <font color="red">3</font>
number: <font color="red">02-444123</font>
 not found

command: <font color="red">3</font>
number: <font color="red">09-222333</font>
 pekka

command: <font color="red">5</font>
whose information: <font color="red">pekka</font>
  address unknown
  phone numbers:
   040-123456
   09-222333

command: <font color="red">4</font>
whose address: <font color="red">pekka</font>
street: <font color="red">ida ekmanintie</font>
city: <font color="red">helsinki</font>

command: <font color="red">5</font>
whose information: <font color="red">pekka</font>
  address: ida ekmanintie helsinki
  phone numbers:
   040-123456
   09-222333

command: <font color="red">4</font>
whose address: <font color="red">jukka</font>
street: <font color="red">korsontie</font>
city: <font color="red">vantaa</font>

command: <font color="red">5</font>
whose information: <font color="red">jukka</font>
  address: korsontie vantaa
  phone number not found

command: <font color="red">7</font>
keyword (if empty, all listed): <font color="red">kk</font>

 jukka
  address: korsontie vantaa
  phone number not found

 pekka
  address: ida ekmanintie helsinki
  phone numbers:
   040-123456
   09-222333

command: <font color="red">7</font>
keyword (if empty, all listed): <font color="red">vantaa</font>

 jukka
  address: korsontie vantaa
  phone number not found

command: <font color="red">7</font>
keyword (if empty, all listed): <font color="red">seppo</font>
 keyword not found

command: <font color="red">6</font>
whose information: <font color="red">jukka</font>

command: <font color="red">5</font>
whose information: <font color="red">jukka</font>
  not found

command: <font color="red">x</font>
</pre>
