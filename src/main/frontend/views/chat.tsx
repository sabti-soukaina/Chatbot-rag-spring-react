import {TextField,Button} from "@vaadin/react-components";
import {useState} from "react";
import {ChatAiService} from "Frontend/generated/endpoints";
import Markdown from "react-markdown";
import '/styles/styles.css';
import robotImage from './technical-support.png';


export default function Chat() {
    const [question, setQuestion] = useState<string>("");
    const [response, setResponse] = useState<string>("");

    async function send() {
        ChatAiService.ragChat(question).then((resp) => {
            setResponse(resp);
        });
    }

    return (
        <div className="chat-page">
            <div className="chat-header">
                <img src={robotImage} alt="Chat Bot" className="chat-bot-image"/>
                <h2>Chat with our Bot</h2>
                <p>Ask me anything, I'm here to help!</p>
            </div>
            <div className="chat-content">
                <TextField
                    style={{ width: '70%' }}
                    onChange={(e => setQuestion(e.target.value))}
                />
                <Button onClick={send} theme="primary">Send</Button>
                <div className="chat-response">
                    <Markdown>
                        {response}
                    </Markdown>
                </div>
            </div>
        </div>
    );
}