import axios from 'axios';

// To overcome CORS issue, we use ngrok to create a tunnel to our localhost
export default axios.create({
  baseURL: 'https://9c96-103-106-239-104.ap.ngrok.io',
  headers: {"ngrok-skip-browser-warning": "true"}
})