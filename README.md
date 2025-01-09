# Scala Generic Class List Comparison Bug

This repository demonstrates a common pitfall in Scala when working with generic classes and comparing objects, specifically Lists.  The `MyClass` class aims to compare values of a generic type `T`, but when `T` is `List`, the comparison fails to produce the expected result due to the use of the '==' operator.

The code includes a test case showing the issue and its resolution in the `MyClassSolution.scala` file.

**Bug:** The original implementation uses the '==' operator which checks reference equality. For Lists, this means it only returns true if the two variables point to the same object in memory, not if they contain the same elements. This results in an unexpected 'false' for the List comparison.

**Solution:** The solution uses `.equals` method for structural comparison of lists which determines equality based on the contents of the list.  This is the correct approach for comparing the content of two lists regardless of whether they reside at the same memory location.