"""
What is an iterator?

An iterator is an object that you can iterate on. (PEP 255)
Iterator is an iterable object, by implementing __iter__ and __next__,
so called iterator protocol.

Why/when we need iterator?

1. Lazy evaluation, it doesnt compute the values when it is instantiated.
This is useful for very large data sets.
2. Iterators can only be iterated over once
"""


def is_prime(num):
    for divisor in range(2, int(num ** 0.5) + 1):
        if num % divisor == 0:
            return False
    return True


class Prime:
    def __init__(self, max):
        self.max = max
        self.num = 1

    def __iter__(self):
        return self

    def __next__(self):
        self.num += 1
        if self.num >= self.max:
            raise StopIteration
        elif is_prime(self.num):
            return self.num
        else:
            return self.__next__()


p = Prime(100)
print(p)
for x in p:
    print(x)

"""
What is Generator?

Generators is used to create iterators. 
Generator is function that use yield keyword. it saves the state of the function. 
The next time it gets called, the function starts from where it was stopped with 
the states it had before yielding.
"""


def Primes(max):
    num = 1
    while num < max:
        num += 1
        if is_prime(num):
            yield num


primes = Primes(100)
for x in primes:
    print(x)

"""
Generator Expressions(PEP 289)
It works exactly the same as list comprehension except we use () to wrap
"""

primes = (x for x in range(2, 100) if is_prime(x))

print(primes)
for x in primes:
    print(x)

"""
Iterators and generators can only be iterated over once.

Generator Expressions are better than Iterators 
"""

primes = filter(is_prime, range(100))
print(primes)
for x in primes:
    print(x)
