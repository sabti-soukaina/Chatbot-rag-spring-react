import React from 'react';
import { Link } from 'react-router-dom';
import '/styles/styles.css';

const HomePage = () => {
    return (
        <div className="homepage">
            <h1>Welcome to Our Chatbot!</h1>
            <p>We are here to assist you with any questions you have.</p>
            <Link to="/chat" className="chat-button">Start Chatting</Link>
        </div>
    );
};

export default HomePage;
