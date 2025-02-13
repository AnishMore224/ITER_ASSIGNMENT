import math

class Shape:
    def area(self):
        pass

class Circle(Shape):
    def __init__(self, radius):
        self.radius = radius

    def area(self):
        return math.pi * self.radius ** 2

class Rectangle(Shape):
    def __init__(self, width, height):
        self.width = width
        self.height = height

    def area(self):
        return self.width * self.height

circle = Circle(5)
rectangle = Rectangle(4, 6)

print(f"Area of the circle: {circle.area():.2f}")
print(f"Area of the rectangle: {rectangle.area():.2f}")

'''
Output---
Area of the circle: 78.54
Area of the rectangle: 24.00
'''