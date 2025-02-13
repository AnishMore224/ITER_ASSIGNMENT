class Dog:
    def speak(self):
        return "Woof!"

class Robot:
    def speak(self):
        return "Beep boop!"

def describe(obj):
    print(obj.speak())

dog = Dog()
robot = Robot()

describe(dog)  
describe(robot)

'''
Output---
Woof!
Beep boop!
'''