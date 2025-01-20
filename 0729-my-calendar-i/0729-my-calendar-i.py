class MyCalendar:

    def __init__(self):
        self.booked_slots = list()
        

    def book(self, s: int, e: int) -> bool:
        
        for start, end in self.booked_slots:
           
            if s < end and e > start:
                return False
        
        self.booked_slots.append([s,e])
        self.booked_slots.sort(key=lambda x: x[0])
        return True
        

        


# Your MyCalendar object will be instantiated and called as such:
# obj = MyCalendar()
# param_1 = obj.book(startTime,endTime)