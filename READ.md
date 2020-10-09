### test practise

现在你接到一个新的需求 — “用户注册”，只需要完成后端的逻辑部分，需求澄清：
- 现阶段可以不使用第三方的数据库
- 数据库可以使用内存数据库（H2，SQLite，HashMap，List...）
- 用户名和密码只能是字母和数字的组合

针对上面的需求描述，对应的Tasking已经拆分好了，请你基于Tasking完成用户注册需求。

### Tasking
- Given 有效的用户名（lisa）和密码（lisa123） When 用户注册 Then 注册成功
- Given 无效的用户名（li,sa）和密码(lisa123) When 用户注册 Then 注册失败，提示用户名格式不对！
- Given 用户名（lisa）和无效密码(lisa,123) When 用户注册 Then 注册失败，提示用户名格式不对！
- Given 无效的用户名（long long long long long long long long long long name）和密码(lisa123) When 用户注册 Then 注册失败，提示用户名长度超过20！
- Given 用户名（lisa）和无效的密码(long long long long long long long  long  password) When 用户注册 Then 注册失败，提示密码长度超过20


### Note：
- 需要遵循TDD的节奏开发
- 编写测试时需要体现测试的不同阶段（测试三部曲）
