## Ceiling of a number

Ceiling means finding smallest element in array thats greater than or equal to target element

arr = [12, 15, 17, 22, 26, 30] 

ceiling, (arr, target = 17) = 17
ceiling, (arr, target = 24) = 26
ceiling, (arr, target = 3) = 12


|  s |   |   |  |  | e  |
|---|---|---|---|---|---|
| 12| 15| 17| 22| 26| 30|

### How do we get the next greater element:

We all know that the space halves with every iteration in binary search, 
and the space will eventually be as small as it can be to get the target, in this case it would be two elements, seeing we did not find out target. Two elements because the array get smaller and smaller until
we come to the smallest version without finding out elements:

Eg, Target = 16

Array is: [12,15,17,22,26,30]
| 0 | 1 | 2 | 3 | 4 | 5 |
|---|---|---|---|---|---|
| 12| 15| 17| 22| 26| 30|


start = 0
mid = 0 + (5 - 0) / 2
(in java we truncate int data type so all decimal places fall away)
mid = 2 
end = 5

| s |   | m |   |   | e |
|---|---|---|---|---|---|
| 12| 15| 17| 22| 26| 30|


Algorithm checks if mid element is < or == or > target element
 17 > 16
 meaning 
 end = mid - 1

 which means:
 end = 1

|  s| e | m |   |   |   |
|---|---|---|---|---|---|
| 12| 15| 17| 22| 26| 30|

**array get smaller and smaller until we come to the smallest version**
**note that the rest of the array still exists, just the indices narrowed down**
Array is narrowed down to: [12,15]

New calculation for mid takes places
mid = 0 + (1 - 0) / 2
mid = 0

|s m| e |   |   |   |   |
|---|---|---|---|---|---|
| 12| 15| 17| 22| 26| 30|


Check if middle element is < or == or > target element
12 < 16
meaning
s = mid + 1
s = 1

|   | es|   |  |   |   |
|---|---|---|---|---|---|
| 12| 15| 17| 22| 26| 30|

Calculate new mid:
 mid = 1 + (1 - 1) / 2
 mid = 1

|   |esm|   |  |   |   |
|---|---|---|---|---|---|
| 12| 15| 17| 22| 26| 30|


Check if mid is > == < target
mid < target

start = mid + 1

|   |em | s |   |   |   |
|---|---|---|---|---|---|
| 12| 15| 17| 22| 26| 30|


Now loop breaks because start index is greater than end index.


|   |em | s |   |   |   |
|---|---|---|---|---|---|
| 12| 15| 17| 22| 26| 30|

return array[start] as answer
answer = 17 is the ceiling
