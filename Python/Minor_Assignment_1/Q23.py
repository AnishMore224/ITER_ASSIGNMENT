d = int(input("Enter "))
w, x, y, z = d / 1000, (d % 1000) / 100, (d % 100) / 10, (d % 10)
print("%d + %d + %d + %d = %d" % (w, x, y, z, w + x + y + z))
