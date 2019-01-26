import com.badlogic.gdx.backends.lwjgl.LwjglApplication
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration
import ktx.app.KtxApplicationAdapter

class MyAdapter : KtxApplicationAdapter {
    override fun create() {
    }

    override fun render() {
    }
}


fun main(args: Array<String>) {
    val config = LwjglApplicationConfiguration()
    config.vSyncEnabled = true
    config.foregroundFPS = 0
    LwjglApplication(MyAdapter(), config)
}

