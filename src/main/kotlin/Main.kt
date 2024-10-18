import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.loadImageBitmap
import androidx.compose.ui.res.useResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

@Composable
@Preview
fun Dashboard() {

    MaterialTheme {
        Column(
            modifier = Modifier.fillMaxSize().padding(start = 500.dp, end = 500.dp),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Select",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                modifier = Modifier.padding(50.dp)
            )
            Card(
                modifier = Modifier.fillMaxWidth(),
                elevation = 10.dp,
                shape = RoundedCornerShape(20.dp),
                backgroundColor = Color.White
            ) {
                Column(
                    modifier = Modifier.fillMaxWidth().padding(top = 30.dp, bottom = 40.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    val bitmap = useResource("ic_idmt.png") {
                        loadImageBitmap(it)
                    }
                    Image(bitmap,"Image IDMT Calculator",
                        modifier = Modifier
                            .size(100.dp)
                            .padding(10.dp))
                    Text(
                        text = "IDMT Calculator",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            }

            Spacer(modifier = Modifier.padding(30.dp))

//            Thermal
            Card(
                modifier = Modifier.fillMaxWidth(),
                elevation = 10.dp,
                shape = RoundedCornerShape(20.dp),
                backgroundColor = Color.White
            ) {
                Column(
                    modifier = Modifier.fillMaxWidth().padding(top = 30.dp, bottom = 40.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    val bitmap = useResource("ic_thermal.png") {
                        loadImageBitmap(it)
                    }
                    Image(bitmap,"Image Thermal Calculator",
                        modifier = Modifier
                            .size(100.dp)
                            .padding(10.dp))
                    Text(
                        text = "Thermal Calculator",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }
    }
}

fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        Dashboard()
    }
}
