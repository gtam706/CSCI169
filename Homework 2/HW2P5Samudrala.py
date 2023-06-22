board = [[0,0,0,0,0,0,0,0],[0,0,0,0,0,0,0,0],[0,0,0,0,0,0,0,0],[0,0,0,0,0,0,0,0],[0,0,0,0,0,0,0,0],[0,0,0,0,0,0,0,0],[0,0,0,0,0,0,0,0],[0,0,0,0,0,0,0,0]]
def check(row,col):
    for i in range(col):
        if board[row][i] == 1:
            return False
    for i, j in zip(range(row, -1, -1),range(col, -1, -1)):
        print(str(i) +" "+ str(j))
        if board[i][j] == 1:
            return False
    for i, j in zip(range(row, 8, 1),
                    range(col, -1, -1)):
        if board[i][j] == 1:
            return False
 
    return True
def solution(col):
    if col >= 8:
        return True
    for i in range(8):
        if check(i,col) == True:
            board[i][col]=1
            if solution(col+1) == True:
                return True
            board[i][col] = 0
    return False
print(solution(0))
for i in range(8):
    print(board[i])

