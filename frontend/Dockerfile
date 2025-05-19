# Финальный этап
FROM node:20-alpine

WORKDIR /app

COPY --from=builder /app/package*.json ./
RUN npm install --omit=dev

COPY --from=builder /app/dist /app/dist

RUN npm install -g vite

EXPOSE 3000

CMD ["vite", "preview", "--host", "--port", "3000"]
