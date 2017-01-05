# HgDataBinding
This example is basically used for simple using of data binding for Views and RecyclerView using model.
<br/>
its a simple example to understand data binding.
<br/>
<br/>
You an refer to this this for more understanding
<br/>

<a href="https://developer.android.com/topic/libraries/data-binding/index.html#build_environmentm">Data Binding on Android Developement Blog</a>
<b>Steps to be followed :</b>

simple add below code in build.gradle

<p>dataBinding {
        enabled = true
    }
    </p>
   <br/> 
 then in your xml file
<br/> 
<p>

<layout xmlns:android="http://schemas.android.com/apk/res/android">

    <data>

        <variable
            name="TextViewDataModel"
            type="com.hg.databinding.model.TextViewDataModel" />

        <variable
            name="ImageDataModel"
            type="com.hg.databinding.model.ImageDataModel" />

    </data>
    
</p>
       
