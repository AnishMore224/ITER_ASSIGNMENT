import doctest

def add(a, b):
    """
    Returns the sum of a and b.

    >>> add(2, 3)
    5
    >>> add(1.5, 2.5)
    4.0
    >>> add(-1.5, -2.5)
    -4.0
    """
    return a + b

if __name__ == "__main__":
    doctest.testmod(verbose=True)
    
'''
Output---
Trying:
    add(2, 3)
Expecting:
    5
ok
Trying:
    add(1.5, 2.5)
Expecting:
    4.0
ok
Trying:
    add(-1.5, -2.5)
Expecting:
    -4.0
ok
1 items had no tests:
    __main__
1 items passed all tests:
   3 tests in __main__.add
3 tests in 2 items.
3 passed and 0 failed.
Test passed.
'''