# 과목별 변수
math  = 78; english = 95; chemistry = 68; science = 62
total = math+english+chemistry+science
average= total/4
print("단순값: ",average)

# 리스트(배열): 인덱스 0부터
subject1 = [78, 95, 68, 62]
subject1[0] = 82
print("리스트: ", subject1)

# 튜플
subject2 = (78, 95, 68, 62)
total = subject2[0]+subject2[1]+subject2[2]+subject2[3]
average = total/4
print("튜플: ", average)
#subject2[0] = 82 오류떠서 주석처리함
#print("[0] 변화한 튜플: ", subject2)

# 문자열 배열
weekdays = ["Monday","Tuesday","Wednesday","Thursday","Friday"]
# 추가(append)
weekdays.append("Saturday")
print(weekdays)
# 삽입(insert)
weekdays.insert(5, "Sunday")
print(weekdays)

# 딕셔너리(dictionary)
score = {
    "math" : 78, 
    "english" : 95,
    "chemistry" : 68,
    "science" : 62
}
print(score)
score["math"] = 82
print("딕셔너리", score)

# 리스트와 튜플을 다루는 주요함수: len, copy, in
print(len(weekdays))
# 리스트: 2차원
data = ([1,2],[3,4,5],[6,7,8,9])
print("1:",len(data))
print("2:",len(data[0]))
print("3:",len(data[1]))
print("4:",len(data[2]))
print("2차원배열의 하나의 요소: ",data[2][3])

#in
greets =("morning","afternoon","evening")
print("noon" in greets) #false
print("evening" in greets) #true
