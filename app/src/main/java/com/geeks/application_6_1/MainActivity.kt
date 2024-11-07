package com.geeks.application_6_1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.geeks.application_6_1.ui.theme.Application_6_1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Application_6_1Theme {
                UserProfileScreen()
            }
        }
    }
}

@Composable
fun UserProfileScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {

        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(id = R.drawable.me_aijan),
                contentDescription = "User Avatar",
                modifier = Modifier
                    .size(80.dp)
                    .clip(CircleShape)
                    .border(2.dp, Color.Gray, CircleShape)
            )
            Spacer(modifier = Modifier.width(16.dp))
            Column {
                Text(
                    text = "Aizhan Kanybekova",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold
                )
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Box(
                        modifier = Modifier
                            .size(8.dp)
                            .clip(CircleShape)
                            .background(Color.Green)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(text = "online", fontSize = 14.sp, color = Color.Gray)
                }
            }
        }

        Spacer(modifier = Modifier.height(24.dp))

        Column {
            Text(
                text = "About me...",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "Hello! My name is Aizhan. " +
                        "I am a Doctor Pediatric Neurologist, however I wanted to realize myself in IT sphere as an ANDROID DEVELOPER. " +
                        "I have been educated 5 months only, just a couple of days ago decided to continue education in GEEKS and reach the end. " +
                        "Till this moment programming was very interesting, incredibly amazing to me. " +
                        "When we started to perform projects, I felt myself on the ninth cloud. I am grateful for everything that I have in my life.",
                fontSize = 14.sp,
                color = Color.Black
            )
            Spacer(modifier = Modifier.height(8.dp))
            Button(
                onClick = { },
                modifier = Modifier.align(Alignment.End)
            ) {
                Text(text = "Edit Profile")
            }
        }

        Spacer(modifier = Modifier.height(24.dp))

        Column {
            Text(
                text = "Interests",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(8.dp))
            InterestItem(icon = ImageVector.vectorResource(id = R.drawable.sport), interest = "Cycling")
            InterestItem(icon = ImageVector.vectorResource(id = R.drawable.reading), interest = "Reading")
            InterestItem(icon = ImageVector.vectorResource(id = R.drawable.cooking), interest = "Cooking")
        }

        Spacer(modifier = Modifier.height(24.dp))

        Text(
            text = "Friends",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(8.dp))
        LazyRow(
            horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
        ) {
            items(friendAvatars) { avatar ->
                Image(
                    painter = painterResource(id = avatar),
                    contentDescription = "Friend Avatar",
                    modifier = Modifier
                        .size(48.dp)
                        .clip(CircleShape)
                        .border(2.dp, Color.Gray, CircleShape)
                )
            }
        }
    }
}

@Composable
fun InterestItem(icon: ImageVector, interest: String) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Icon(
            imageVector = icon,
            contentDescription = "Interest Icon",
            modifier = Modifier.size(24.dp)
        )
        Spacer(modifier = Modifier.width(8.dp))
        Text(text = interest, fontSize = 16.sp)
    }
}

val friendAvatars = listOf(
    R.drawable.camila,
    R.drawable.olga,
    R.drawable.juma,
    R.drawable.mesedu
)