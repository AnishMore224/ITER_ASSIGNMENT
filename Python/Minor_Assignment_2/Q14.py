room_type=input("Enter room type:")
len_stay=int(input("Enter no. of nights of stay:"))
season=input("Enter season (Peak season/ Off- season):")
member=input("Is loyalty Member(Yes / No):")
cost=0
match room_type:
    case 'Standard':
        cost+=100*len_stay
    case 'Deluxe':
        cost+=150*len_stay
    case 'Suite':
        cost+=250*len_stay
    case _:
        print("Invalid Room type")
if cost!=0:
    if season == 'Peak season':
        cost+=0.2*cost
    else: 
        cost-=cost*0.15
    if len_stay>3:
        cost-=cost*0.1
    elif len_stay>7:
        cost-=cost*0.2
    if member == 'Yes':
        cost-=cost*0.05
print("Final price:",cost)

'''
Ouput--
Enter room type: Standard
Enter no. of nights of stay: 4
Enter season (Peak season/ Off- season): Peak season
Is loyalty Member(Yes / No): Yes
Final price: 410.4
'''