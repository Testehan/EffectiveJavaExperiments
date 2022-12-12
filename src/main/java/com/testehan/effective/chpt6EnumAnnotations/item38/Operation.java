package com.testehan.effective.chpt6EnumAnnotations.item38;

/*
    While the enum type (BasicOperation) is not extensible, the interface type
    (Operation) is, and it is the interface type that is used to represent operations in
    APIs. You can define another enum type that implements this interface and use
    instances of this new type in place of the base type.
*/

public interface Operation {
    double apply(double x, double y);
}
