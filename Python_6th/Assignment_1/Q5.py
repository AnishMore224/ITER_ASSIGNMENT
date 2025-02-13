class Time:
    def __init__(self, time_str):
        self.time_str = time_str

    def is_valid_time(self):
        try:
            hours, minutes, seconds = map(int, self.time_str.split(':'))
            if 0 <= hours < 24 and 0 <= minutes < 60 and 0 <= seconds < 60:
                return True
            else:
                return False
        except ValueError:
            return False

    def convert_to_12_hour(self):       
        hours, minutes, seconds = map(int, self.time_str.split(':'))
        period = "AM"
        if hours >= 12:
            period = "PM"
            if hours > 12:
                hours -= 12
        elif hours == 0:
            hours = 12
        
        return f"{hours:02}:{minutes:02}:{seconds:02} {period}"

time_input = "14:30:45"
time_obj = Time(time_input)
if time_obj.is_valid_time():
    print(f"Original time: {time_input}")
    print(f"Converted time: {time_obj.convert_to_12_hour()}")
else:
    print("Invalid time format")

'''
Output---
Original time: 14:30:45
Converted time: 02:30:45 PM
'''