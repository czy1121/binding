# binding

简化 DataBinding/ViewBinding 使用，提供生命周期感知能力，支持多种使用环境(ComponentActivity/Fragment/CustomDialog/ViewGroup)

## Gradle

``` groovy
repositories {
    maven { url "https://gitee.com/ezy/repo/raw/cosmo/"}
}
dependencies {
    implementation "me.reezy.cosmo:binding:0.10.0"
    implementation "me.reezy.cosmo:binding-adapter:0.10.0"
}
```

## API


```kotlin
// 通过上下文找到已经存在的 View 并绑定
inline fun <reified T : ViewBinding> ComponentActivity.binding(owner: LifecycleOwner? = null): Lazy<T>
inline fun <reified T : ViewBinding> Fragment.binding(owner: LifecycleOwner? = null): Lazy<T>
inline fun <reified T : ViewBinding> CustomDialog.binding(owner: LifecycleOwner? = null): Lazy<T>

// 通过 viewFinder 找到已经存在的 View 并绑定
inline fun <reified T : ViewBinding> binding(owner: LifecycleOwner? = null, noinline viewFinder: () -> View): Lazy<T>

// 解析布局添加到 ViewGroup，然后再绑定
inline fun <reified T : ViewBinding> ViewGroup.binding(owner: LifecycleOwner? = null): Lazy<T>
```

## 使用

在 ComponentActivity 中使用

```kotlin
class MainActivity : AppCompatActivity(R.layout.activity_main) {
    val binding0 by lazy { ActivityMainBinding.bind(findViewById<ViewGroup>(android.R.id.content).getChildAt(0)) }

    // 与 binding0 等价
    val binding1: ActivityMainBinding by binding()

    // 提供生命周期感知能力
    val binding2: ActivityMainBinding by binding(this)
}
```

在 Fragment 中使用

```kotlin
class SimpleFragment : Fragment(R.layout.layout_simple) {
    val binding0 by lazy { LayoutSimpleBinding.bind(requireView()) }

    // 与 binding0 等价
    val binding1: LayoutSimpleBinding by binding()

    // 提供生命周期感知能力
    val binding2: LayoutSimpleBinding by binding(this)
}
```

在 CustomDialog 中使用

```kotlin
class SimpleCustomDialog(context: Context) : CustomDialog(context) {
    val binding0 by lazy { LayoutSimpleBinding.bind(requireView()) }

    // 与 binding0 等价
    val binding1: LayoutSimpleBinding by binding()

    // 提供生命周期感知能力
    val binding2: LayoutSimpleBinding by binding(this)

    init {
        setView(R.layout.layout_simple)
    }

}
```

在 Dialog 中使用

```kotlin
class SimpleDialog(context: Context) : Dialog(context), LifecycleOwner {

    val binding0 by lazy { LayoutSimpleBinding.bind(requireView()) }

    // 与 binding0 等价
    val binding1: LayoutSimpleBinding by binding(viewFinder = this::requireView)

    // 提供生命周期感知能力
    val binding2: LayoutSimpleBinding by binding(owner = this, viewFinder = this::requireView)

    init {
        setContentView(R.layout.layout_simple)
    }

    fun requireView(): View {
        TODO("Not yet implemented")
    }

    override fun getLifecycle(): Lifecycle {
        TODO("Not yet implemented")
    }

}
```

在 CustomView 中使用

```kotlin

class CustomView(context: Context, attrs: AttributeSet? = null): ViewGroup(context, attrs) {

    val binding0 by lazy { LayoutSimpleBinding.inflate(LayoutInflater.from(context), this, true) }

    // 与 binding0 等价
    val binding1: LayoutSimpleBinding by binding()

    // 提供生命周期感知能力
    val binding2: LayoutSimpleBinding by binding(resolveLifecycleOwner)


    override fun onLayout(changed: Boolean, l: Int, t: Int, r: Int, b: Int) {
    }

}
```

## LICENSE

The Component is open-sourced software licensed under the [Apache license](LICENSE).