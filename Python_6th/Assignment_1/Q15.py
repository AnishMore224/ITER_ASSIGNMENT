from dataclasses import dataclass

@dataclass
class Person:
    name: str
    age: int
    city: str = "Unknown"  

    def greet(self):
        return f"Hello, my name is {self.name} and I am {self.age} years old from {self.city}."

person = Person(name="Ram", age=30)

print(person.name) 
person.age = 31
print(person.age)  

print(person.greet()) 

'''
Output---
Ram
31
Hello, my name is Ram and I am 31 years old from Unknown.
'''