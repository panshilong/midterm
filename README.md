# midterm
其中作业——notepad的功能扩展

必选 时间戳——

增加修改时间时间戳显示
1-1:使用LinearLayout替换原来的TextView（以便更好的扩展内容）并增加显示时间戳的TextView

![image](https://user-images.githubusercontent.com/38639268/202957431-3c821887-6a9b-4b3d-b5f4-6708f8c43a65.png)
![image](https://user-images.githubusercontent.com/38639268/202957551-d7b4c9c4-0a02-4a03-9487-62ebdd588789.png)

1-2：
在NoteList类中的final String[] PROJECTION 成员内
增加COLUMN_NAME_MODIFICATION_DATE（增加修改时间的标识，用于在数据库中查询对应的列内容）
在onCreat方法内的String[] dataColumns数组内也增加同样的字符（用于页面控件的数据绑定）

![image](https://user-images.githubusercontent.com/38639268/202959468-44edab67-dab3-4395-9d23-6a602a1f9bf7.png)

图里的SimpleCursorAdapter adapter，便是查询信息的关键
当onCreat方法内的Cursor cursor = managedQuery{***}执行时，就能取得修改时间戳的数据
再通过onCreat方法里SimpleCursorAdapter adapter= new SimpleCursorAdapter{***}
进行查询数据和页面控件的数据绑定
最后再使用一次SimpleCursorAdapter.ViewBinder viewBinder=new SimpleCursorAdapter.ViewBinder(){***}中的setViewValue方法
把得到的时间戳格式化为"yyyy.MM.dd HH:mm:ss"的形式
最终得到——

![时间戳](https://user-images.githubusercontent.com/38639268/202886399-d186ba68-1bd9-4ca9-a270-933f423f7394.jpg)

必选 搜索——

![搜索](https://user-images.githubusercontent.com/38639268/202886405-a1469f7c-e265-420a-886b-f31321b97080.jpg)

【扩展1】界面美化——

![界面简单美化](https://user-images.githubusercontent.com/38639268/202886409-ef7fd2a6-8430-4b94-92e5-0f8946de3980.jpg)

【扩展2】切换背景——
原背景——

![image](https://user-images.githubusercontent.com/38639268/202960795-54708d8a-16cf-4a56-bff7-392623a21c44.png)

切换后

![切换背景](https://user-images.githubusercontent.com/38639268/202886413-cb9b801c-31e4-4dc8-8aec-565198d554b5.jpg)


