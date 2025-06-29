package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.content.MediaType.Companion.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BusinessCardTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),

                ) {
                    BusinessCard(
                        name = stringResource(R.string.name),
                        number = stringResource(R.string.tel_number),
                        email = stringResource(R.string.email),
                        address = stringResource(R.string.location),
                        title = stringResource(R.string.title)
                    )
                }
            }
        }
    }
}


@Composable
fun PersonalCard(name: String, title: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.outline_adb_24)
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier.size(125.dp)
        )
        Text(
            text = name,
            fontSize = 38.sp
        )
        Text(
            text = title,
            fontSize = 16.sp
        )
    }
}


@Composable
fun DetailsCard(number: String, address: String, email: String, modifier: Modifier = Modifier) {
    val numberImage = painterResource(R.drawable.outline_123_24)
    val addressImage = painterResource(R.drawable.baseline_account_circle_24)
    val emailImage = painterResource(R.drawable.outline_attach_email_24)
    Column(
        modifier = modifier.padding(start = 16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        ContactRow(icon = numberImage, text = number)
        ContactRow(icon = addressImage, text = address)
        ContactRow(icon = emailImage, text = email)
    }
}

@Composable
fun BusinessCard(number: String, address: String, email: String, name: String, title: String, modifier: Modifier = Modifier) {
    Column(
        modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.weight(1f))
        PersonalCard(name = name, title = title)
        Spacer(modifier = Modifier.weight(0.7f))
        DetailsCard(number = number, address = address, email = email)
        Spacer(modifier = Modifier.weight(0.3f))
    }

}

@Composable
fun ContactRow(icon: Painter, text: String) {
    val configuration = LocalConfiguration.current
    val screenWidthDp = configuration.screenWidthDp.dp
    val dynamicPadding = screenWidthDp / 10
    Row(
        modifier = Modifier
            .padding(start = dynamicPadding)
            .fillMaxWidth()
            .height(30.dp),
        verticalAlignment = Alignment.CenterVertically,

    ) {
        Box(
            modifier = Modifier
                .width(30.dp)
                .fillMaxHeight(),
            contentAlignment = Alignment.CenterStart
        ) {
            Image(
                painter = icon,
                contentDescription = null,
                modifier = Modifier.size(28.dp)
            )
        }
        Text(
            text = text,
            modifier = Modifier.padding(start = 10.dp),
            fontSize = 18.sp
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    BusinessCard(
        number = "+1 (234) 567-8901",
        address = "123 Main St, Springfield",
        email = "example@email.com",
        name = "John Doe",
        title = "Software Engineer"
    )
}

