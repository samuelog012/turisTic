package turis.Tic

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import turis.Tic.databinding.ActivityUserBinding

class UserActivity : AppCompatActivity() {

    private lateinit var binding: ActivityUserBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUserBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val name3 = intent.getStringExtra("name")
        val description3 = intent.getStringExtra("description")
        val country3 = intent.getStringExtra("country")
        val imageId3 = intent.getIntExtra("imageId", R.drawable.b)


        binding.nameProfile.text= name3
        binding.DescriptProfile.text=description3
        binding.profileImage.setImageResource(imageId3)
        binding.countryProfile.text= country3





    }
}