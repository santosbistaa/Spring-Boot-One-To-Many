Day 28: Leveling Up with @OneToMany Relationships! 
1) @OneToMany Overview 
 - Learned how 1 instructor can have many courses 
 - Understood the power of this fundamental relationship 
2) Database Setup
 - Created perfectly linked tables 
 - Prepared for bidirectional mapping 

Day 29: Bringing @OneToMany to Life! 
1) Built `Course` entity 
2) Mapped it to `Instructor`  and performed cascade except DELETE
3) Made the app actually run with real data 

Day 30: Eager vs Lazy Loading - The Great JPA Debate! 
1) Eager Loading
 - "Load it ALL now!" approach 
 - Simpler but can be overkill 
2) Lazy Loading 
 - "I'll load it when needed" 
 - Better performance but needs careful handling 

Day 31: Cracking the Lazy Loading Challenge!
1) Lazy Loading in Action 
 - Made `instructor.getCourses()` load only when needed 
 - Saw how lazy prevents unnecessary data loads 
2) JOIN FETCH Magic 
 - One query to rule them all! 
 - Eliminated duplicate queries with this JPA superpower 
