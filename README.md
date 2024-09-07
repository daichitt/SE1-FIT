| Iteration | `hasNext()` | 1st `next()` Return Value | Condition `arr.next() > 5` | 2nd `next()` Return Value | Output | Iterator State      | Notes                                             |
|-----------|-------------|---------------------------|----------------------------|----------------------------|--------|---------------------|--------------------------------------------------|
| 1         | true        | 2                         | false                      | (not called)                | -      | Advances to 3        | Even indexed element is skipped                   |
| 2         | true        | 3                         | false                      | (not called)                | -      | Advances to 5        | Even indexed element is skipped                   |
| 3         | true        | 5                         | false                      | (not called)                | -      | Advances to 7        | Even indexed element is skipped                   |
| 4         | true        | 7                         | true                       | 11                         | 11     | Advances to 13       | Passes condition at 7, outputs 11                |
| 5         | true        | 13                        | true                       | 17                         | 17     | Advances to 19       | Passes condition at 13, outputs 17               |
| 6         | true        | 19                        | true                       | 23                         | 23     | Advances to 29       | Passes condition at 19, outputs 23               |
| 7         | true        | 29                        | true                       | (no more elements)          | Error  | NoSuchElementException | 2nd `next()` call when no more elements available |
