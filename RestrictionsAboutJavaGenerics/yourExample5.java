package com.company;
public class MobileDevice<T, Smartphone, Pager, TabletPC> {
    private static T os;
// If static fields of type parameters were allowed,
// then the following code would be confused:

    MobileDevice<Smartphone> phone = new MobileDevice<>();
    MobileDevice<Pager> pager = new MobileDevice<>();
    MobileDevice<TabletPC> pc = new MobileDevice<>();
}
