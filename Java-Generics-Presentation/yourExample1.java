package com.company;
// Can't create an instance of T.
class Gen<T> {
    T ob;/*java  2 s  .c om*/

    Gen() {
        ob = new T(); // Illegal!!!
    }
}