days = int(input("Enter number of days: "))
hours = int(input("Enter number of hours: "))
minutes = int(input("Enter number of minutes: "))
seconds = int(input("Enter number of seconds: "))
total_seconds = days * 86400 + hours * 3600 + minutes * 60 + seconds
print("Total number of seconds: %d" % total_seconds)

'''
Output---
Enter number of days: 23
Enter number of hours: 02
Enter number of minutes: 20
Enter number of seconds: 24
Total number of seconds: 1995624
'''