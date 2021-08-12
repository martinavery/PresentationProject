package se.fishbase.presentationproject

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class PostAdapter(private val posts: List<Post>) : RecyclerView.Adapter<PostViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.post_layout, parent, false)
        return PostViewHolder(view)
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        val currentPostAtPos = posts[position]
        holder.bind(currentPostAtPos)
    }

    override fun getItemCount(): Int {
        return posts.size
    }
}

class PostViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
    val context = view.context

    val tvName: TextView = view.findViewById(R.id.tvName)
    val tvPost: TextView = view.findViewById(R.id.tvPost)
    val btnLike: Button = view.findViewById(R.id.btn_like)
    val btnComment: Button = view.findViewById(R.id.btn_comment)

    fun bind(post: Post) {
        tvName.text = post.posterName
        tvPost.text = post.postDesc

        btnLike.setOnClickListener {
            Toast.makeText(
                context,
                "Ni-like mo ang post ni ${post.posterName}!",
                Toast.LENGTH_SHORT
            ).show()
        }

        btnComment.setOnClickListener {
            Toast.makeText(
                context,
                "Nag-comment ka sa  post ni ${post.posterName}!",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}

