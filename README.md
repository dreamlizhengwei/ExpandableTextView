# ExpandableTextView
可折叠的TextView，网上找了一些现成的发现存在一些问题

 - 不支持动态改变折叠时最大行数
 - ExpandableTextView嵌套在其他布局中展开折叠时高度计算有问题，会出现充满父布局的问题。

效果图如下：
![](/expandtextview.gif)
***代码中使用了属性动画，如果需要支持低版本，可将属性动画替换为NineOldAndroids***的属性动画

博客地址：http://blog.csdn.net/lizhengwei1989/article/details/51583568
