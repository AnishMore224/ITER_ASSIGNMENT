height = float(input("Enter height from which the object is dropped in meters: "))
v1 = 0
a = 9.8
vf = (v1**2 + 2*a*height)**0.5
print("The object is travelling at %.2f m/s when it hits the ground." % vf)

'''
Output---
Enter height from which the object is dropped in meters: 120
The object is travelling at 48.50 m/s when it hits the ground.
'''